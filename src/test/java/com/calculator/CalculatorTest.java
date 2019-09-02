package com.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.calculator.Calculator;

public class CalculatorTest
{
	@Test
    public void testAdd() throws Exception {
    	String addTestCaseFilePath = "/src/test/java/testFiles/addTestCaseFile.txt";
    	
    	Calculator calculator = new Calculator();
    	double result = calculator.calculateFromFile(addTestCaseFilePath);
    	assertEquals(22, result, 0);
    }
	
	@Test
    public void testSubtract() throws Exception {
    	String substractTestCaseFilePath = "/src/test/java/testFiles/subtractTestCaseFile.txt"; 

    	Calculator calculator = new Calculator();
    	double result = calculator.calculateFromFile(substractTestCaseFilePath);
    	assertEquals(-46, result, 0);
    }

	@Test
    public void testMultiply() throws Exception {
    	String multiplyTestCaseFilePath = "/src/test/java/testFiles/multiplyTestCaseFile.txt"; 
    	
    	Calculator calculator = new Calculator();
    	double result = calculator.calculateFromFile(multiplyTestCaseFilePath);
    	assertEquals(-80, result, 0);
    }

	@Test
    public void testDivide() throws Exception {
		String divideTestCaseFilePath = "/src/test/java/testFiles/divideTestCaseFile.txt"; 

    	Calculator calculator = new Calculator();
    	double result = calculator.calculateFromFile(divideTestCaseFilePath);
    	assertEquals(-1.5, result, 0);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() throws Exception {
    	String divideByZeroTestCaseFilePath = "/src/test/java/testFiles/divideByZeroTestCaseFile.txt"; 

    	Calculator calculator = new Calculator();
    	calculator.calculateFromFile(divideByZeroTestCaseFilePath);
    }

	@Test
    public void testCombineOperations() throws Exception {
    	String combineOperationsTestCaseFilePath = "/src/test/java/testFiles/combineOperationsTestCaseFile.txt"; 

    	Calculator calculator = new Calculator();
    	double result = calculator.calculateFromFile(combineOperationsTestCaseFilePath);
    	assertEquals(27, result, 0);
    }

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidOperationMethod() throws Exception {
		String invalidMethodOperationTestFilePath = "/src/test/java/testFiles/invalidMethodOperationTestFile.txt";
	
    	Calculator calculator = new Calculator();
    	calculator.calculateFromFile(invalidMethodOperationTestFilePath);
	}
	
	
}
