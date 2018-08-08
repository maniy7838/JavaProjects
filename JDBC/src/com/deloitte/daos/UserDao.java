package com.deloitte.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.deloitte.jdbc.Dao;
import com.deloitte.jdbc.User;

public class UserDao implements Dao<User> {

	Connection connection = null;
	PreparedStatement ps = null;
	static {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void getConnection() throws SQLException {
		connection = DriverManager.getConnection("jdbc:oracle:thin:@desktop-m03s522:1522:teamdb", "mani", "member12");

	}
	
	private void releaseResource() {
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
	@Override
	public User get(long id) {

		return null;
	}

	@Override
	public List<User> getAll() {
<<<<<<< HEAD
		ResultSet rs = null;
try {
			
			
			getConnection();
			
			ps = connection.prepareStatement("SELECT * FROM USERS");
						
			rs = ps.executeQuery();
			ArrayList<User> user = new ArrayList<User>();
			int userId;
			String userName;
			String firstName;
			String lastName;
			String password;
			String status;
			User row;
			while(rs.next()) {
			
			userId = rs.getInt(1);
			userName = rs.getString(2);
			firstName = rs.getString(3);	
			lastName = rs.getString(4);	
			password = rs.getString(5);	
			status = rs.getString(6);	
			
			row  = new User(userId, userName, firstName, lastName, password, status);
				user.add(row);
				
			}
			connection.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			releaseResource();
		}
=======

>>>>>>> branch 'master' of https://github.com/maniy7838/JavaProjects
		return null;
	}

	@Override
	public void save(User user) {
<<<<<<< HEAD
		

=======

		Connection connection = null;
		PreparedStatement ps = null;
>>>>>>> branch 'master' of https://github.com/maniy7838/JavaProjects
		try {
<<<<<<< HEAD
			
			
			getConnection();
			
=======

			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

			connection = DriverManager.getConnection("jdbc:oracle:thin:@desktop-m03s522:1522:teamdb", "mani",
					"member12");

>>>>>>> branch 'master' of https://github.com/maniy7838/JavaProjects
			ps = connection.prepareStatement("INSERT INTO USERS VALUES(?,?,?,?,?,?)");

			ps.setInt(1, user.getUserId());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getFirstName());
			ps.setString(4, user.getLastName());
			ps.setString(5, user.getPassword());
			ps.setString(6, user.getStatus());
<<<<<<< HEAD
			
			ps.execute();
			
=======

>>>>>>> branch 'master' of https://github.com/maniy7838/JavaProjects
			connection.close();

		} catch (SQLException e) {

			e.printStackTrace();
<<<<<<< HEAD
		}
		finally {
			releaseResource();
=======
		} finally {
			try {
				if (connection != null && !connection.isClosed()) {

					connection.close();
				}
				if (ps != null && !ps.isClosed()) {

					ps.close();
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}
>>>>>>> branch 'master' of https://github.com/maniy7838/JavaProjects
		}

	}

	@Override
<<<<<<< HEAD
	public void update(User user, String[] params) {
		
try {
			
			
			getConnection();
			
			ps = connection.prepareStatement("INSERT INTO USERS VALUES(?,?,?,?,?,?)");
			
			ps.setInt(1, user.getUserId());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getFirstName());
			ps.setString(4, user.getLastName());
			ps.setString(5, user.getPassword());
			ps.setString(6, user.getStatus());
			
			ps.execute();
			
			connection.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			releaseResource();
		}
		
		
=======
	public void update(User t, String[] params) {

>>>>>>> branch 'master' of https://github.com/maniy7838/JavaProjects
	}

	@Override
<<<<<<< HEAD
	public void delete(User user) {

		try {
			
			
			
			getConnection();
			
			ps = connection.prepareStatement("DELETE FROM USERS WHERE ID = ?");
			
			ps.setInt(1, user.getUserId());
			ps.execute();
			
			connection.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			releaseResource();
		}
=======
	public void delete(User t) {

>>>>>>> branch 'master' of https://github.com/maniy7838/JavaProjects
	}

}
