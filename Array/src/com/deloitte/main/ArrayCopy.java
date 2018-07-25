package com.deloitte.main;

public class ArrayCopy {
	public static void main(String[] args) {
		
		int[] a = new int[5];
		int[] b = new int[10];

		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		System.arraycopy(a, 0, b, 0, 5);
		
		for(int cell: b) {
			System.out.print("\t" + cell);
		}
	}

}
