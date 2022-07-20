package com.masai.Dao;

import java.util.List;

import com.Bean.Employee;
import com.Exception.EmployeeException;

public interface empDao {
	
	public String insertEmployeeDetails( Employee emp) ;
	
	public int getsalaryByID(int id) throws EmployeeException;
	
	public String updateBonus(int bonus);
	
	public String insertSpecificEmployeeDetails( Employee emp) ;
	
	public Employee getEmployeeDetails(int id) throws EmployeeException;
	
	public List<Employee> getAllDetails() throws EmployeeException;
	
	public List<Employee> getAllDetailsSalaryLessThan() throws EmployeeException;

}
