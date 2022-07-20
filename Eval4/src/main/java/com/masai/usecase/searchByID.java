package com.masai.usecase;

import java.util.Scanner;

import com.masai.DAO.AccountDao;
import com.masai.DAO.AccountDaoIMPL;
import com.masai.entity.Account;
import com.masai.exceptionHandling.InvalidAccount;

public class searchByID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Account ID :");
  int id=sc.nextInt();
		
		AccountDao ADAO=new AccountDaoIMPL();
		try {
			Account acc=ADAO.findById(id);
			System.out.println(acc);
		} catch (InvalidAccount e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
