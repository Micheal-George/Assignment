package com.Qus_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Details");
		System.out.println("Enter  RollNo");
		int roll=sc.nextInt();
		System.out.println("Enter  Name");
		String name=sc.next();
		System.out.println("Enter  Email");
		String email=sc.next();
		System.out.println("Enter  Password");
		String pass=sc.next();
		System.out.println("Enter City ");
		String cname=sc.next();
		System.out.println("Enter State");
		String state=sc.next();
		System.out.println("Enter Pincode");
		String pcode=sc.next();
		
		
		
		Address a=new Address(state, cname, pcode);
		Student s=new Student(roll, name, a, email, pass);
		
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student.txt"));
			
			oos.writeObject(s);
			oos.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    try {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("student.txt"));
		try {
			Student stud=(Student)ois.readObject();
			System.out.println(stud);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
