package com.Bean;

public class Employee {
	
	int eid;
	String name;
	String address;
	int salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int mark) {
		this.salary = mark;
	}
	public Employee(int eid, String name, String address, int mark) {
		super();
		this.eid = eid;
		this.name = name;
		this.address = address;
		this.salary = mark;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", address=" + address + ", mark=" + salary + "]";
	}

	
}
