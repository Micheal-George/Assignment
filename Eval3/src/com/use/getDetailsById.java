package com.use;

import java.util.Scanner;

import com.EmployeeException.EmployeeException;
import com.bean.Employee;
import com.dao.empDao;
import com.dao.empdaoImpl;



public class getDetailsById {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee ID");
		int id= sc.nextInt();
		
		empDao emp=new empdaoImpl();
		
		try {
			
			Employee emp1=emp.getEmployeeById(id);
			System.out.println("Employee id : "+emp1.getEmpId());
			System.out.println("Employee name : "+emp1.getName());
			System.out.println("Employee Address : "+emp1.getAddress());
			System.out.println("Employee Salary : "+emp1.getSalary());
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
