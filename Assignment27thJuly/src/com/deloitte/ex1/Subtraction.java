package com.deloitte.ex1;

public class Subtraction extends Arithmetic {

	public Subtraction(int num1, int num2, int num3) {
		super(num1, num2, num3);
		
	}

	@Override
	public void calculate() {
		
		num3 =  num1 - num2;

	}

}
