package com.revature.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.User;
import com.revature.util.ConnectionFactory;

public class PostgreSQLImpl implements UserRepository {

	@Override
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		/*
		 * When working with JDBC, there are several interfaces
		 * and classes that we use to facilitate a connection
		 * to our database, query our database, and hold the 
		 * retrieved records.
		 * 
		 * Our Connection interface provides the means for actually
		 * connecting to our database.
		 * 
		 * Our Statement interface is used to prepare statements that
		 * we will execute.
		 * 
		 * Our ResultSet interface is used to store the records we retrieve from
		 * our database.
		 */
		Connection conn = null;
		Statement stmt = null;
		ResultSet set = null;
		
		try {
		conn = ConnectionFactory.getConnection();
		final String SQL = "SELECT * FROM user";
		stmt = conn.createStatement();
		set = stmt.executeQuery(SQL);
		
		while(set.next()) {
			users.add(new User(
					set.getInt(1),
					set.getString(2),
					set.getString(3))
					);
		}
		/*
		 * The SQLException is an exception that is specific to JDBC.
		 */
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			conn.close();
			stmt.close();
			set.close();
			//close your connection, statement, result set
		}
		
		return users;
	}

	@Override
	public void getUserById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub

	}

}
