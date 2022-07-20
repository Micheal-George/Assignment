package com.useCase;

import java.util.Scanner;

import com.Bean.Employee;
import com.masai.Dao.empDao;
import com.masai.Dao.empDaoIMPL;

public class insertEmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empDao ed=new empDaoIMPL();
		int i=0;
		
		while(i<1) {
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
  emp.setEid(id);
  emp.setName(name);
  emp.setAddress(addr);
  emp.setSalary(salary);
  
  
  
    String msg=ed.insertEmployeeDetails(emp);
    System.out.println(msg);
    
    System.out.println("Enter Y to cotinue N to stop");
    String ch=sc.next();
    if(ch.equalsIgnoreCase("n"))
    	i++;
		}
		System.out.println("data inserted");
	}

}
