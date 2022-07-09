package com.Masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insertdetailsTospecificColumn {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		String cs="jdbc:mysql://localhost:3306/db1";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID :");
		int id=sc.nextInt();
		System.out.println("Enter Employee Name :");
		String name=sc.next();
		
		System.out.println("Enter Employee Salary :");
		int salary=sc.nextInt();
		
		try(Connection conn=DriverManager.getConnection(cs, "root", "Polakulam")){
			
			PreparedStatement ps=conn.prepareStatement("insert into employee(eid,name,salary) values(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2,name);
			ps.setInt(3, salary);
			
			int x=ps.executeUpdate();
			if(x>0)
			
				System.out.println("Inserted");
			else
				System.out.println(" not Inserted");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}
}
