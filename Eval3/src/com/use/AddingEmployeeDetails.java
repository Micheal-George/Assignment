package com.use;

import java.util.Scanner;

import com.bean.Employee;
import com.dao.empDao;
import com.dao.empdaoImpl;

public class AddingEmployeeDetails {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID :");
		int id=sc.nextInt();
		System.out.println("Enter Employee Name :");
		String name=sc.next();
		System.out.println("Enter Employee Address :");
		String addr=sc.next();
		System.out.println("Enter Employee Salary :");
		int salary=sc.nextInt();
		
     Employee emp=new Employee();
  emp.setEmpId(id);;
  emp.setName(name);;
  emp.setAddress(addr);
  emp.setSalary(salary);
  
  empDao ed=new empdaoImpl();
  
    String msg=ed.saveEmployeeDetails(emp);
    System.out.println(msg);
	}

}
