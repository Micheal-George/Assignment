package com.Masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class incrementBonus {

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
		
		System.out.println("Enter Bonus Amount   :");
		int salary=sc.nextInt();
		
		try(Connection conn=DriverManager.getConnection(cs, "root", "Polakulam")){
			
			PreparedStatement ps=conn.prepareStatement("update employee set salary =salary+?");
			ps.setInt(1, salary);
			
			int x=ps.executeUpdate();
			if(x>0)
			
				System.out.println("updated");
			else
				System.out.println(" not updated");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	

	}

}
