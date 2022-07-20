package com.use;

import java.util.List;

import com.bean.Employee;
import com.dao.empDao;
import com.dao.empdaoImpl;



public class getEmpDetails {

	public static void main(String[] args) {
		
		empDao dao=new empdaoImpl();
		
	
			List<Employee> emp=dao.getAllEmployees();
			
			if(emp.size()>0)
			{
			for(Employee s : emp) {
				System.out.println("Employee id : "+s.getEmpId());
				System.out.println("Employee name : "+s.getName());
				System.out.println("Employee Address : "+s.getAddress());
				System.out.println("Employee Salary : "+s.getSalary());
				System.out.println("--------------------------------------");
			}
			}
			else
			{
				System.out.println("No data found");
			}
			
		 
		
		

	}

	

}
