package com.calculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.calculator.binary.operators.Add;
import com.calculator.binary.operators.Divide;
import com.calculator.binary.operators.InitialNumber;
import com.calculator.binary.operators.Multiply;
import com.calculator.binary.operators.Number;
import com.calculator.binary.operators.Subtract;
import com.calculator.consts.OperationNames;

public class Calculator {

	private Number number;
	
	protected final Logger logger = LoggerFactory.getLogger(getClass().getName()); 
	
	public double calculateFromFile(String filePath) throws Exception {
		ArrayList<String> operations = collectOperations(filePath);

		// Set initial value at the beggining of operations stack and then remove it
		String applyOperation = operations.get(operations.size() - 1);
		this.number = dispatchOperation(applyOperation, this.number);		
		operations.remove(operations.size() - 1);
		
		Iterator<String> iterator = operations.iterator();
		
		while (iterator.hasNext()) {			
			String operation = iterator.next();
			this.number = dispatchOperation(operation, this.number);
		}		

		logger.info("\n>>> File path: " + filePath + "\n>>> Output: " + this.number.getNumberResult());
	
		return this.number.getNumberResult();
	}
	
	private ArrayList<String> collectOperations(String filePath) {
		BufferedReader reader;
		ArrayList<String> operations = new ArrayList<String>();
		
		filePath = Paths.get(".").toAbsolutePath().normalize().toString() + filePath;

		try {
			reader = new BufferedReader(new FileReader(filePath));
			String line = reader.readLine();
			
			while (line != null) {
				operations.add(line);
				line = reader.readLine();
			}
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return operations;
	}

	private Number dispatchOperation(String command, Number number) throws IllegalArgumentException {
		String[] elements = command.split(" ");
		String operation = elements[0].toLowerCase();
		double operationValue = Float.parseFloat(elements[1]);
		
		switch (operation) {
			case OperationNames.OPERATION_ADD:
				number = new Add(number, operationValue);
				break;
			case OperationNames.OPERATION_SUBTRACT:
				number = new Subtract(number, operationValue);
				break;
			case OperationNames.OPERATION_DIVIDE:
				number = new Divide(number, operationValue);
				break;
			case OperationNames.OPERATION_MULTIPLY:
				number = new Multiply(number, operationValue);
				break;
			case OperationNames.OPERATION_APPLY:
				number = new InitialNumber(operationValue);
				break;
			default:
				throw new IllegalArgumentException("Invalid Math operation passed");
		}
		
		return number;
	}

}
