package com.masai.usecase;

import java.util.Scanner;

import com.masai.DAO.EmployeeDAO;
import com.masai.DAO.EmployeeDAOIMPL;

public class getNameandAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee ID");
		int id=sc.nextInt();
		
		EmployeeDAO empdao=new EmployeeDAOIMPL();
	String[]	s=empdao.getNameAndAddress(id);
	
	System.out.println("Name of Employee :"+s[0]);
	System.out.println("Address of Employee :"+s[1]);

	}

}
