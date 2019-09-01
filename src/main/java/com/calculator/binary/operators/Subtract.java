package com.calculator.binary.operators;

public class Subtract extends BinaryOperator {

	private double subtractValue;
	
	public Subtract(Number number, double subtract) {
		super(number);
		subtractValue = subtract;
	}

	public double getNumberResult() {
		return super.getNumberResult() - subtractValue;
	}
}
