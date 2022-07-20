package com.masai.usecase;

import java.util.Scanner;

import com.masai.DAO.AccountDao;
import com.masai.DAO.AccountDaoIMPL;
import com.masai.entity.Account;
import com.masai.exceptionHandling.InsufficientBalance;
import com.masai.exceptionHandling.InvalidAccount;

public class withDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Amount to withdraw :");
		  double amt=sc.nextDouble();
		Account acc=new Account(10, "mike@gmail.com", "delhi", 9000);
			
			AccountDao ADAO=new AccountDaoIMPL();
			try {
				int j;
				try {
					j = ADAO.withdraw(amt, acc);
					System.out.println(j);
				} catch (InsufficientBalance e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (InvalidAccount e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			};

		}
	

	

}
