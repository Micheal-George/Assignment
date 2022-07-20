package com.use;

import java.util.Scanner;

import com.EmployeeException.EmployeeException;
import com.dao.empDao;
import com.dao.empdaoImpl;

public class deleteDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee ID");
		int id= sc.nextInt();
		
		empDao emp=new empdaoImpl();
		
		try {
			String msg=emp.deleteEmployee(id);
			System.out.println(msg);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
