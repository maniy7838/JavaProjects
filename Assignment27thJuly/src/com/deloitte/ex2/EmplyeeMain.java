package com.deloitte.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmplyeeMain {

	public EmplyeeMain() {

	}

	public static void main(String[] args) {
		EmplyeeBo eb = new EmplyeeBo();
		EmplyeeSort es = new EmplyeeSort();

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		ArrayList<EmplyeeVo> arraylist = new ArrayList<EmplyeeVo>();

		try {
			for (int i = 0; i < number; i++) {
				
				System.out.print("Enter The ID "+(i+1)+":");
				int id = sc.nextInt();
				
				System.out.print("Enter The EmpName "+(i+1)+":");
				String EmpName = sc.next();
				
				System.out.print("Enter The AnnualIncome "+(i+1)+":");
				double annual = sc.nextDouble();
				
				arraylist.add(new EmplyeeVo(id, EmpName, annual, 0));
				eb.CalincomeTax(arraylist.get(i));
			}
		} catch (Exception e) {
			
			System.out.println("Enter correctly");
		}
		
		for (EmplyeeVo emplyeeVo : arraylist) {
			System.out.println(emplyeeVo);
		}
		Collections.sort(arraylist, es);
		
		System.out.println("Sorted Listed is");
		for (EmplyeeVo emplyeeVo : arraylist) {
			System.out.println(emplyeeVo);
		}
		sc.close();

	}

}