package com.masai.usecase;

import java.util.List;

import com.masai.DAO.EmployeeDAO;
import com.masai.DAO.EmployeeDAOIMPL;
import com.masai.entity.Employee;

public class getList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO emp=new EmployeeDAOIMPL();
		
		List<Employee> em=emp.getAllEmployee();
		
		for(Employee e: em)
		{
			System.out.println(e);
		}

	}

}
