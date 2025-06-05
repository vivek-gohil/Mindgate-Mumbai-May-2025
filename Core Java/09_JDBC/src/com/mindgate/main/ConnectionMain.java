package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMain {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "training_mumbai";
		String password = "training_mumbai";
		String driver = "oracle.jdbc.driver.OracleDriver";
		Connection connection = null;

		try {
			// 1. Load Driver
			Class.forName(driver);
			System.out.println("Driver loaded successfully");
			// 2. Connect Database
			connection = DriverManager.getConnection(url, user, password);
			if (connection != null)
				System.out.println("Connection successfull");
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load driver");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println("Failed to connect database");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
					connection = null;
				}
			} catch (SQLException e) {
				System.out.println("Failed to close connection");
				System.out.println(e.getMessage());
			}
		}
	}
}
