package com.Masai;

import java.util.Scanner;

class Bank 
 {
	 String branchName;
	 String IfscCode;
	 
	  void displayDetails() {
		  System.out.println("branchName : "+branchName);
		  System.out.println("IfscCode : "+IfscCode);
		 
	 }
 }

 class AxisBank extends Bank
 {
	 double rateOfInterest=8;;



	@Override
  void displayDetails() {
		System.out.println("branchName : "+branchName);
		  System.out.println("IfscCode : "+IfscCode);
		  System.out.println("rateOfInterest : "+rateOfInterest);
		 
		 
	 }
	 
	 void getCreditCard() {
		 System.out.println("Get the Credit Card from the Axis bank");
	 }
		
 }

 
 class ICICIBank extends Bank
 {
	 double rateOfInterest=7.5;
	 
	 @Override
  void displayDetails() {
			System.out.println("branchName : "+branchName);
			  System.out.println("IfscCode : "+IfscCode);
			  System.out.println("rateOfInterest : "+rateOfInterest);
		 
	 }
	
 }


public class Demo {
	
	public static Bank getBank(String bank) {
		if(bank.equals("ICICI"))
		{
			ICICIBank I=new ICICIBank();
			I.branchName="KTM";
			I.IfscCode="ABC5678";
			I.displayDetails();
			return I;
		}
		else if(bank.equals("Axis"))
		{
			AxisBank A=new AxisBank();
			A.branchName="CHRY";
			A.IfscCode="ABC1234";
			A.displayDetails();
			A.getCreditCard();
			return A;
		}
		else
		{
			return null;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bank Name");
		String X=sc.next();
		getBank(X);
		
	
		
	}
}
