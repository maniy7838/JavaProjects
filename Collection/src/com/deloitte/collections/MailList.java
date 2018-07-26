package com.deloitte.collections;

import java.util.HashSet;
import java.util.Iterator;

class Address{
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	private int id;
	public Address(String n, String s, String c, String st, String cd, int i) {
		
		name = n;
		street = s;
		city = c;
		state = st;
		code = cd;
		id =i;
	}
	
	@Override
	public String toString() {
	
		return id + "\n" + name + "\n" + street + "\n" + city + "\n" + state + "\n" + code;
	}
	@Override
	public boolean equals(Object obj) {

		if(obj !=null) {
			if(obj instanceof Address) {
				 Address add = (Address)obj;
				if(name==add.name && street==add.street && city==add.city && state==add.state  && code==add.code && id==add.id) {
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		
		return id;
	}

	
	
}

class MailList {

	public static void main(String[] args) {
		
		HashSet<Address> ml = new HashSet<Address>();
		
		ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801", 1));
		ml.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahome", "IL", "61853", 2));
		ml.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820", 3));
		ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801", 1));
		
		Iterator<Address> itr = ml.iterator();
		while(itr.hasNext()) {
			
			System.out.print(itr.next() + "\n");
		}
			
			
		
 	}
}
