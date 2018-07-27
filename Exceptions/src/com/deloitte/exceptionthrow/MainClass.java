package com.deloitte.exceptionthrow;

class IllegalAgeException extends Exception{
	@Override
	public String getMessage() {
		
		return "Age should be 18 or above";
	}
}


class Voter{
	public void register(int age) throws IllegalAgeException {
		if(age<18) {
			throw new IllegalAgeException();
		}
	}
}
public class MainClass {

	public static void main(String[] args) {

	Voter voter = new Voter();
	
	try {
		voter.register(16);
	} catch (IllegalAgeException e) {
		
		e.printStackTrace();
	} 

	}

}
