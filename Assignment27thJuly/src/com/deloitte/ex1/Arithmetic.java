package com.deloitte.ex1;

import java.util.Scanner;

public abstract class Arithmetic {
	int num1;
	int num2;
	int num3;
	Scanner sc = new Scanner(System.in);
	public Arithmetic(int num1, int num2, int num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	public int getNum3() {
		return num3;
	}
	public abstract void calculate();
	
	public void read() {
		
		System.out.print("Enter First Number: ");
		num1 = sc.nextInt();
		
		System.out.print("Enter Second Number: ");
		num2 = sc.nextInt();
		
	}
	
	public void display() {
		
		System.out.println("Result = " + num3);
	}
	
	
	

}
