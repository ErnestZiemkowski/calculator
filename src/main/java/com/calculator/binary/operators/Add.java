package com.calculator.binary.operators;

public class Add extends BinaryOperator {

	private double addValue;
	
	public Add(Number number, double add) {
		super(number);
		addValue = add;
	}
	
	public double getNumberResult() {
		return tempNumber.getNumberResult() + addValue;
	}
}
