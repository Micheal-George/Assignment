package com.useCase;

import java.util.Scanner;

import com.Exception.EmployeeException;
import com.masai.Dao.empDao;
import com.masai.Dao.empDaoIMPL;

public class getSalarybyID {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee ID");
		int id= sc.nextInt();
		
		empDao emp=new empDaoIMPL();
		
		try {
			int salary=emp.getsalaryByID(id);
			System.out.println("Employee Salary :"+salary);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
