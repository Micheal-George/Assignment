package com.masai.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptID;
	private String dname;
	private String location;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Employee> emps=new ArrayList<Employee>();


	public int getDeptID() {
		return deptID;
	}


	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public List<Employee> getEmps() {
		return emps;
	}


	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}


	@Override
	public String toString() {
		return "Department [deptID=" + deptID + ", dname=" + dname + ", location=" + location + ", emps=" + emps + "]";
	}
	

}
