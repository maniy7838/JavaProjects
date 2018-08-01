package com.deloitte.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;



public class UserDao implements Dao<User> {

	@Override
	public User get(long id) {
		
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

	@Override
	public void save(User user) {
		
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			
			Context initCtx = new InitialContext();
			DataSource ds = (DataSource)initCtx.lookup("java:comp/env/jdbc/TeamDB");

			connection = ds.getConnection();
			ps = connection.prepareStatement("INSERT INTO USERS VALUES(?,?,?,?,?,?)");
			
			ps.setInt(1, user.getUserId());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getFirstName());
			ps.setString(4, user.getLastName());
			ps.setString(5, user.getPassword());
			ps.setString(6, user.getStatus());
			

			
			connection.close();
			
		} catch (SQLException | NamingException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				if(connection!= null && !connection.isClosed()) {
				
					connection.close();
				}
				if(ps!=null && !ps.isClosed()) {
					
					ps.close();
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
	}

	@Override
	public void update(User t, String[] params) {
		
		
	}

	@Override
	public void delete(User t) {
		
		
	}

}
