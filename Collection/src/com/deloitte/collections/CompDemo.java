package com.deloitte.collections;

import java.util.Comparator;

class MyComp implements Comparator<String>{
	public int compare(String a, String b) {
		String aStr, bStr;
		
		aStr = a;
		bStr = b;
		
		return bStr.compareTo(aStr);
	}
	
}
public class CompDemo {

}
