package com.deloitte.collections;


import java.util.Iterator;
import java.util.LinkedList;

public class MainClass {

	public static void main(String[] args) {
		
	LinkedList<String> result = new LinkedList<String>();
	
	result.add("B");
	result.add("C");
	result.add("D");
	result.add("X");
	result.add("Y");
	result.addLast("Z");
	result.addFirst("A");
	
	result.add(1, "A2");
	
	System.out.println("Original contents of result: "  + result);
	
	result.remove("F");
	result.remove(2);
	
	System.out.println("Contents of result after deletion: " + result);
	
	result.removeFirst();
	result.removeLast();
	
	System.out.println("Contents after deleting first and last element:" + result);
	
	String val = result.get(2);
	result.set(2, val + " Changed");
	
	System.out.println("result after change: " + result);
	
	Iterator<String> iterator = result.iterator();
	String str;
	while(iterator.hasNext()) {
		str = iterator.next();
		System.out.print(str + "\t");
	}

	}
}
