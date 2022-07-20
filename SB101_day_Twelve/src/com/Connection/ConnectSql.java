package com.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectSql {

	public static Connection connectionProvider() {
		Connection conn=null;
		   
		
	
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
	
		String cs="jdbc:mysql://localhost:3306/db3";
		try {
			conn=DriverManager.getConnection(cs, "root", "Polakulam");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return conn;
	}
}
