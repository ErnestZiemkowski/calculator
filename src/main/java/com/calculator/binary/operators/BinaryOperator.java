package com.calculator.binary.operators;

abstract class BinaryOperator implements Number {

	protected Number tempNumber;
	
	public BinaryOperator(Number number) {
		tempNumber = number;
	}
	
	public double getNumberResult() throws IllegalArgumentException {
		return tempNumber.getNumberResult();
	}
	
}
