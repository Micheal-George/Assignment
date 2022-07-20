package com.dao;

import java.util.List;

import com.EmployeeException.EmployeeException;
import com.bean.Employee;

public interface empDao {
	
	public String saveEmployeeDetails(Employee employee);
	
	public Employee getEmployeeById(int empId) throws EmployeeException;
	
	public List<Employee> getAllEmployees();
	
	public String deleteEmployee(int empId)throws EmployeeException;

}
