package com.Masai;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo1 {

	public boolean validate(String name, String mobileNum, String aadharCard) {
		if(Pattern.matches("[a-z]{3,8}",name))
		{
			if(Pattern.matches("[6-9]{1}[0-9]{9}",mobileNum))
			{
				if(Pattern.matches("[0-9]{12}",aadharCard))
				{
					Citizen C=new Citizen( name, mobileNum,aadharCard);
					C.showDetail();
				}
				else
				{
					System.out.println("Enter valid Aadhar Number");
				}
			}
			else
			{
				System.out.println("Enter valid Mobile Number");
			}
		}
		else
		{
			System.out.println("Enter valid Name");
		}
		return true;
	}
	public static void main(String[] args) {
		
		Demo1 D=new Demo1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Ener Name");
		String name=sc.next();
		
		System.out.println("Ener Mobile Number");
		String Mnum=sc.next();
		
		System.out.println("Ener Aadhar Number");
		String Anum=sc.next();
		
		D.validate(name, Mnum, Anum);
		

	}

}
