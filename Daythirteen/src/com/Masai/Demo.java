package com.Masai;

import java.text.NumberFormat;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("start of main..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		try {
			String message = null;
			int num3 = num1 / num2;
			if(num3 > 10){
			message = "Welcome to Exception Handling ";
			}
			
			System.out.println("Message is :"+message.toUpperCase());
		}
		catch(ArithmeticException ae){
			System.out.println("num2 should not be 0");
			
		}
		catch(NumberFormatException num) {
			System.out.println("Please enter valid number");
		}
		catch(NullPointerException nu) {
			System.out.println("String value is null");
		}
		System.out.println("end of main");

	}

}
