package com.deloitte.main;

import com.deloitte.daos.UserDao;
import com.deloitte.jdbc.User;

public class MainClass {

	public static void main(String[] args) {
		
		UserDao udao = new UserDao();
		User user = new User(2,"Avijit","Avijit","Verma","pass*11","E");

		udao.save(user);
		
		//udao.getAll();
		
		//udao.delete(user);
		
		// User user1 = new User(2,"Avijit","Avijit","Verma","pass*11","E");
		 
		// udao.save(user1);
	}

}
