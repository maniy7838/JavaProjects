package com.deloitte.ex1;

import java.util.Scanner;

public class Calculator {

	public Calculator() {
		
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		
		System.out.println("Enter Choice ");
		System.out.println("1.add 2.sub 3.mul 4.div");
		choice = sc.nextInt();

		Arithmetic[] ar = { new Addition(0, 0, 0), 
							new Subtraction(0, 0, 0),
							new Multiplication(0, 0, 0),
							new Divide(0, 0, 0) };

		ar[choice-1].read();
		
		try {
			
			ar[choice-1].calculate();
			ar[choice-1].display();
		}
		catch(ArithmeticException e){
			
			System.out.println("cannot divide by zero");
			
		}
		finally {
			sc.close();
		}

	}

	public static void main(String[] args) {

		new Calculator();

	}

}
