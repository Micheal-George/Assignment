package com.Dayten;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Science Student Details");
		System.out.println("Enter Name of The Student");
		String name=sc.next();
		System.out.println("Enter Address of The Student");
		String add=sc.next();
		System.out.println("Enter Physics Mark ");
		int pm=sc.nextInt();
		System.out.println("Enter Chemistry Mark ");
		int cm=sc.nextInt();
		System.out.println("Enter Maths Mark ");
		int mm=sc.nextInt();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter History Student Details");
		System.out.println("Enter Name of The Student");
		String Name=scan.next();
		System.out.println("Enter Address of The Student");
		String Add=scan.next();
		System.out.println("Enter History Mark ");
		int hm=scan.nextInt();
		System.out.println("Enter civics Mark ");
		int cc=scan.nextInt();
		
		ScienceStudent S=new ScienceStudent(pm, cm, mm);
		S.address=add;
		S.name=name;
		System.out.println("Details of Science Student");
		System.out.println("Name : "+S.name);
		System.out.println("Adress : "+S.address);
		System.out.println("Average Mark of science student : "+S.getPercentage());
		System.out.println("=======================================");
	
		
		
		HistoryStudent H=new HistoryStudent(hm, cc);
		H.address=Add;
		H.name=Name;
		System.out.println("Details of  History Student");
		System.out.println("Name : "+H.name);
		System.out.println("Adress : "+H.address);
		System.out.println("Average Mark of History student : "+H.getPercentage());
		System.out.println("=======================================");
//
	}

}
