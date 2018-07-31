package com.deloitte.web.controller;

import java.io.Serializable;

public class UserBean implements Serializable {

	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean authenticate(String userName, String password) {
		if (userName != null && password != null) {

			if (userName.equalsIgnoreCase("Mani") && password.equals("pass123")) {
				
				firstName = "Mani";
				lastName = "Yadav";
				return true;
			}
			else {
				return false;
				
			}
		}
		return false;
	}
}
