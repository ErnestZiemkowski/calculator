package com.calculator.binary.operators;

public class Multiply extends BinaryOperator {

	private double multiplyByValue;
	
	public Multiply(Number number, double multiplyBy) {
		super(number);
		multiplyByValue = multiplyBy;
	}

	public double getNumberResult() {
		return super.getNumberResult() * multiplyByValue;
	}
}
