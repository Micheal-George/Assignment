package com.masai;

public class Student {
	
	private int roll;
	private String name;
	

	public void setRoll(int roll) {
		this.roll = roll;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student ===> name=" + name + ", roll=" + roll ;
	}
	
	

}
