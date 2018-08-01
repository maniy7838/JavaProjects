package com.deloitte.web.controller;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.deloitte.dao.User;
import com.deloitte.dao.UserDao;

public class UserBean implements Serializable {

	private String firstName;
	private String lastName;
	private PreparedStatement ps = null;
	
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

	public boolean authenticate(String userName, String password) throws NamingException, SQLException {
		if (userName != null && password != null) {

		
			if (userName.equalsIgnoreCase("Mani") && password.equals("pass123")) {
				
			
				
				
				firstName = "Mani";
				lastName = "Yadav";
				
				User users = new User(3, userName,  firstName,lastName, password, "E");
				UserDao userd = new UserDao();
				
				userd.save(users);
			
				return true;
			}
			else {
				return false;
				
			}
		}
		return false;
	}
}
