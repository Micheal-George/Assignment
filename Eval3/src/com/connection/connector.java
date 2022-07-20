package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connector {
	
	public static Connection connectionProvider()
	{
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String cs="jdbc:mysql://localhost:3306/db1";
			try {
				conn=DriverManager.getConnection(cs, "root", "Polakulam");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}

}




