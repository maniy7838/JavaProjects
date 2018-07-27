package com.deloitte.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {

	HashMap<Integer, String> result = new HashMap<Integer, String>();
	
	result.put(12, "abc");
	result.put(45, "edf");
	result.put(98, "ghi");
	result.put(21, "mno");
	
	System.out.println(result.size());
	System.out.println(result.get(21));
	
	Set<Integer> s = result.keySet();
	
	Iterator<Integer> itr = s.iterator();
	Integer key;
	while(itr.hasNext()) {
		key = itr.next();
		System.out.println(key + "---" + result.get(key));
	}
	
 	}

}
