package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	/*
	 * I only need once instance of a connection for this application.
	 */
	private static Connection conn;
	
	public static Connection getConnection() {
		
		if(conn == null) {
			try {
				/*
				 * Hardcoding your url, username, and password into the application
				 * is bad practice (primarily for security reasons). We can instead
				 * use environment variables to obscure our login credentials.
				 */
				conn = DriverManager.getConnection(System.getenv("dburl"), "user", "password");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return conn;
	}
}
