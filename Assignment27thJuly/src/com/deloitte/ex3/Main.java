package com.deloitte.ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
		
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		
		int[] ar=new int[size];
		
		boolean b;
		
		for(int i=0;i<size;i++){
			
			
			ar[i]=sc.nextInt();
		}
		 
		b=UserMainCode.checktriplets(ar);
				
		System.out.println(b);

		sc.close();
		
	}

}
