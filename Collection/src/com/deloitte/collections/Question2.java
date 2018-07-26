package com.deloitte.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Question2 {

	public static void main(String[] args) {
		
	
	ArrayList<String> al = new ArrayList<String>();
	
	al.add("C");
	al.add("A");
	al.add("E");
	al.add("B");
	al.add("D");
	al.add("F");
	
	System.out.println("Original contents of al: ");
	
	Iterator<String> itr = al.iterator();
	while(itr.hasNext()) {
		String element = itr.next();
		System.out.println(element + " ");
	}
	
	System.out.println();
	
	ListIterator<String> litr = al.listIterator();
	while(litr.hasNext()) {
		String element = litr.next();
		litr.set(element + "+");
		
	}
	
	System.out.println("Modified contents of al: ");
	itr = al.iterator();
	while(itr.hasNext()) {
		String element = itr.next();
		System.out.print(element + "");
	}
	System.out.println();
	
	System.out.println("Modified list backwards: ");
	
	while(litr.hasPrevious()) {
		
		String element = litr.previous();
		System.out.println(element + " ");
	}
	System.out.println();
			}
}