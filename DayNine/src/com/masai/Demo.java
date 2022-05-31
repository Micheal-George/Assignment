package com.masai;
public class Demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1=new Students();
		s1.setName("Micheal");
		s1.setRoll(25);
		s1.setMarks(500);
		s1.displayDetails();
		
		Students s2=new Students();
		s2.setName("shameem");
		s2.setRoll(35);
		s2.setMarks(300);
		s2.displayDetails();
		
		Students s3=new Students(15,"me",450);
		System.out.println(s3);
	}
	
}
  class Students {

	private int roll;
	private String name;
	private int marks;
	private char grade;

	public void displayDetails()
	{
		System.out.println("Roll No : "+roll);
		System.out.println("Name : "+name);
		System.out.println("Mark : "+marks);
		System.out.println("Grade : "+calculateGrade());
		System.out.println("-----*----*------*------");
	}
	private char calculateGrade()
	{
		int M=getMarks();
		
		if(M>=500) 
			grade='A';
		         
		if(M<500&&M>=400)
			grade='B';
		
		if(M<400) 
			grade='C';
		
		return grade;
	}
	public Students() {
		
	}
public Students(int roll ,String name,int marks) {
		this.roll=roll;
		this.name=name;
		this.marks=marks;
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
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
	@Override
	public String toString(){//overriding the toString() method
	return getRoll()+" "+getName() +" "+ getMarks()+" "+calculateGrade();
	}
	public static void main(String[] args) {
		
	}
 }
