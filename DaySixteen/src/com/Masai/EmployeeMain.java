package com.Masai;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		TreeSet<Employee> emp = new TreeSet<>();
		
		int j=0;
		while(j<4)
		{
			System.out.println("Enter Employee Details");
			System.out.println("Emp ID");
			int empID=sc.nextInt();
			System.out.println("Emp Name");
			String empname=sc.next();
			System.out.println("Emp Salary");
			double emppp=sc.nextDouble();
			Employee E=new Employee(empID,empname,emppp);
			emp.add(E);
			j++;
		}	
		ArrayList<Employee> list=new ArrayList<>(emp);
		System.out.println("Employee Details");
		for(Employee e:list) {
			System.out.println(e);
		}

	}

}
