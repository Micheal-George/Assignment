package com.useCase;

import java.util.Scanner;

import com.Bean.Employee;
import com.Exception.EmployeeException;
import com.masai.Dao.empDao;
import com.masai.Dao.empDaoIMPL;

public class getEmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee ID");
		int id= sc.nextInt();
		
		empDao emp=new empDaoIMPL();
		
		try {
			
			Employee emp1=emp.getEmployeeDetails(id);
			System.out.println("Employee id : "+emp1.getEid());
			System.out.println("Employee name : "+emp1.getName());
			System.out.println("Employee Address : "+emp1.getAddress());
			System.out.println("Employee Salary : "+emp1.getSalary());
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
}
