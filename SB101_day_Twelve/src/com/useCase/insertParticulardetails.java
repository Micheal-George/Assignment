package com.useCase;

import java.util.Scanner;

import com.Bean.Employee;
import com.masai.Dao.empDao;
import com.masai.Dao.empDaoIMPL;

public class insertParticulardetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empDao ed=new empDaoIMPL();
		int i=0;
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID :");
		int id=sc.nextInt();
		System.out.println("Enter Employee Name :");
		String name=sc.next();
		System.out.println("Enter Employee Salary :");
		int salary=sc.nextInt();
		
     Employee emp=new Employee();
  emp.setEid(id);
  emp.setName(name);
  emp.setSalary(salary);
  
  
  
    String msg=ed.insertEmployeeDetails(emp);
    System.out.println(msg);
    
  
	}


}
