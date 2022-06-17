package com.Masai;

import java.util.Scanner;

public class Account {
	String accountNumber;
	double Balance=0; 

	
	void deposit(int amount) {
		
		Balance+=amount;
		if(Balance>0) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Balance :"+Balance);
			System.out.println("Enter withdraw amount");
			int amt=sc.nextInt();
			try {
				System.out.println("Balance Amount :"+withdraw(amt));}
		catch	 (InsufficientFundsException e) {
				System.out.println(e.getMessage());
				System.out.println("Transaction incomplete");;
			
		}
		}
		else
		{System.out.println("Balance is Zero");}
	}
	
	
	 double withdraw(int amount)throws  InsufficientFundsException{
		 if(Balance<amount) {
			 InsufficientFundsException e=new InsufficientFundsException("Not sufficient Balance");
			 throw e;
		 }
		 System.out.println("Transaction completed");
		return Balance-amount; 
		 
	 }
	
	public static void main(String[] args) {
		
		

	}

}
