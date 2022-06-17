package com.Masai;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
		Account A=new Account();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to Deposit");
		int amt=sc.nextInt();
		A.deposit(amt);
	}
}
