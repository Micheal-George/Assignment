package com.Masai;

public class Citizen {
	
	String name;
	String aadharNumber; 
	String mobileNumber;

	public Citizen(String name,String mobileNumber,String aadharNumber) {
		this.name=name;
		this.mobileNumber=mobileNumber;
		this.aadharNumber=aadharNumber;
		
		
	}
	
	void showDetail() {
		System.out.println("Name : "+name);
		System.out.println("Aadhar Number : "+aadharNumber);
		System.out.println("Mobile Number : "+mobileNumber);
	}
}
