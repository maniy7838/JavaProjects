package com.deloitte.ex3;


public class UserMainCode {

	public static boolean checktriplets(int[] array) {

		
		for(int i=0;i<array.length-2;i++) {
			
			if(array[i]==array[i+1] && array[i]==array[i+2]) {
				return true;
			}
			else 
				continue;
		}
		return false;
	}


}