package com.Masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class searchWithId {

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
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID :");
		int id=sc.nextInt();
		
		
		try(Connection conn=DriverManager.getConnection(cs, "root", "Polakulam")){
			
			PreparedStatement ps=conn.prepareStatement("select salary from employee where eid=?");
			ps.setInt(1, id);
			
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				System.out.println("Salary of Employee(ID:"+id+") is : "+rs.getInt("salary"));
			}
			else
			{
				System.out.println("Invalid ID");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
