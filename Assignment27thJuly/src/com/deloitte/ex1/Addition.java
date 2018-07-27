package com.deloitte.ex1;

public class Addition extends Arithmetic {

	public Addition(int num1, int num2, int num3) {
		super(num1, num2, num3);
		
	}

	@Override
	public void calculate() {
		
		num3 =  num1 + num2;

	}

}
