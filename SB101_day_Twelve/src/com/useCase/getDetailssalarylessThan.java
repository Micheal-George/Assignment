package com.useCase;

import java.util.List;

import com.Bean.Employee;
import com.Exception.EmployeeException;
import com.masai.Dao.empDao;
import com.masai.Dao.empDaoIMPL;

public class getDetailssalarylessThan {

	public static void main(String[] args) {
empDao dao=new empDaoIMPL();
		
		try {
			List<Employee> emp=dao.getAllDetailsSalaryLessThan();
			
			for(Employee s : emp) {
				System.out.println("Employee id : "+s.getEid());
				System.out.println("Employee name : "+s.getName());
				System.out.println("Employee Address : "+s.getAddress());
				System.out.println("Employee Salary : "+s.getSalary());
				System.out.println("--------------------------------------");
			}
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
