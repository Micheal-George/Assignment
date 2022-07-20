package com.masai.usecase;

import java.util.Scanner;

import com.masai.DAO.EmployeeDAO;
import com.masai.DAO.EmployeeDAOIMPL;

public class deleteEmployeebyID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee ID");
		int id=sc.nextInt();
		
		EmployeeDAO empdao=new EmployeeDAOIMPL();
		boolean flag=empdao.deleteEmployee(id);
		if(flag)
			 System.out.println("Deleted");
		else
			System.out.println("Not 	Deleted");

	}

}
