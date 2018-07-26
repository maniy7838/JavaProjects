package com.deloitte.main;

import java.util.Collection;
import java.util.LinkedList;

class DBAccess{
	public Collection<String> getResult(){
		
		LinkedList<String> result = new LinkedList<String>();
		
		result.add("M");
		result.add("A");
		result.add("I");
		result.add("N");
		result.add("A");
		
		return result;
		
	}
}

public class MainClass {

	public static void main(String[] args) {
		
		DBAccess dba = new DBAccess();
		 
		Collection<String> col = dba.getResult();
		
		for(String element: col) {
			
			System.out.println(element);
		}

	}
}
