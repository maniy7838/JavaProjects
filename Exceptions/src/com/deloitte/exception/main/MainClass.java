package com.deloitte.exception.main;

public class MainClass {
	public static void main(String[] args) {
		
		try {
			System.out.println(Integer.parseInt(args[0])/  Integer.parseInt(args[1]));
			System.out.println("End of try");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Please enter 2 Valid numbers"); 
		}
		catch(NumberFormatException ex) {
			System.out.println("Enter valid numbers");
		}
		catch(ArithmeticException ex) {
			System.out.println("Cannot divvide by zero");
		}
		System.out.println("End of program");
	}

}
