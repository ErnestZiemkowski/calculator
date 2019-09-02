package com.calculator.binary.operators;

public class Divide extends BinaryOperator {

	private double divideByValue;
	
	public Divide(Number number, double divideBy) {
		super(number);
		divideByValue = divideBy;
	}
	
	public double getNumberResult() throws IllegalArgumentException {
		if (divideByValue == 0) {
			throw new IllegalArgumentException("Can not divide by 0");
		}
		
		return super.getNumberResult() / divideByValue;
	}
}
