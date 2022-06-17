package com.Masai;

public class Student implements Comparable<Student> {
	private int roll;
	private String name;
	private int mark;
	public Student(int roll, String name, int mark) {
		super();
		this.roll = roll;
		this.name = name;
		this.mark = mark;
	}
	public Student() {
		super();
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public int compareTo(Student s2) {
		if(this.getMark()>s2.getMark())
			return 1;
		else if(this.getMark()<s2.getMark())
			return -1;
		else
		return 0;
		
	}
	

}
