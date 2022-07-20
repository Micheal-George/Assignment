package com.masai.usecase;

import com.masai.DAO.AccountDao;
import com.masai.DAO.AccountDaoIMPL;
import com.masai.entity.Account;
import com.masai.exceptionHandling.InvalidAccount;

public class updateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Account acc=new Account(11, "mike@gmail.com", "delhi", 9000);
		
		AccountDao ADAO=new AccountDaoIMPL();
		try {
			ADAO.update(acc);
		} catch (InvalidAccount e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		};

	}
	

}
