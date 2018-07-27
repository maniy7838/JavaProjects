package com.deloitte.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.deloitte.jdbc.Dao;
import com.deloitte.jdbc.User;

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
			
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			connection = DriverManager.getConnection("jdbc:oracle:thin:@desktop-m03s522:1522:teamdb", "mani", "member12");
			
			ps = connection.prepareStatement("INSERT INTO USERS VALUES(?,?,?,?,?,?)");
			
			ps.setInt(1, user.getUserId());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getFirstName());
			ps.setString(4, user.getLastName());
			ps.setString(5, user.getPassword());
			ps.setString(6, user.getStatus());
			

			
			connection.close();
			
		} catch (SQLException e) {
			
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
