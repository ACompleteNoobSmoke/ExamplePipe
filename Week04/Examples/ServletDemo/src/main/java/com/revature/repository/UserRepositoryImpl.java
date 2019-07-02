package com.revature.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.model.User;
import com.revature.util.ConnectionClosers;
import com.revature.util.ConnectionFactory;

public class UserRepositoryImpl implements UserRepository{

	@Override
	public User getUserByUsername(String username) {
		User u = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet set = null;
		final String SQL = "SELECT * FROM servlets.users WHERE username = ?";
		
		try {
			conn = ConnectionFactory.getConnection();
			stmt = conn.prepareStatement(SQL);
			stmt.setString(1, username);
			set = stmt.executeQuery();
			
			while(set.next()) {
				u = new User(set.getInt(1), set.getString(2), set.getString(3));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionClosers.closeConnection(conn);
			ConnectionClosers.closeStatement(stmt);
			ConnectionClosers.closeResultSet(set);
		}
		
		return u;
	}

}
