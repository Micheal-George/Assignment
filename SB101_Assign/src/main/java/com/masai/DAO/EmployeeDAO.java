package com.masai.DAO;

import java.util.List;

import com.masai.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> getAllEmployee();

	public String getAddressOfEmployee(int empId);

	public String giveBonusToEmployee(int empId, int bonus);

	public boolean deleteEmployee(int empId);

	public String[] getNameAndAddress(int empId);

}
