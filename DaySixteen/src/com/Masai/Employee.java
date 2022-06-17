package com.Masai;

public class Employee implements Comparable<Employee>{
	
	int empId; 
	String empName; 
	 double salary ;
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	@Override
	public int compareTo(Employee e) {
		if(this.getSalary()>e.getSalary())
			return 1;
		else if(this.getSalary()>e.getSalary())
			return -1;
		else
			return 0;
			
	
}

}
