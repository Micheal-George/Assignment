package com.Masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class allDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		String cs="jdbc:mysql://localhost:3306/db1";
	
		

		try(Connection conn=DriverManager.getConnection(cs, "root", "Polakulam")){
			
			PreparedStatement ps=conn.prepareStatement("select * from employee");
		
			
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println("Employee ID : "+rs.getInt("eid"));
				System.out.println("Employee Name : "+rs.getString("name"));
				System.out.println("Employee Address : "+rs.getString("address"));
				System.out.println("Employee Salary : "+rs.getInt("salary"));
				System.out.println("====================================");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}
	

}
