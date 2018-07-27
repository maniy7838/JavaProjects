package com.deloitte.main;

import com.deloitte.daos.UserDao;
import com.deloitte.jdbc.User;

public class MainClass {

	public static void main(String[] args) {
		
		UserDao udao = new UserDao();
		User user = new User(1,"Mani","Mani","Yadav","pass*12","E");

		udao.save(user);
	}

}
