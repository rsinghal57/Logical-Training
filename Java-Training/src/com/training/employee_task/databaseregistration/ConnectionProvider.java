package com.training.employee_task.databaseregistration;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	static Connection conn;

	public static Connection createConnection() {
		try {
			// Load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Create Connection
			String user = "root";
			String password = "root";
			String url = "jdbc:mysql://192.168.0.156/rohit_test";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
