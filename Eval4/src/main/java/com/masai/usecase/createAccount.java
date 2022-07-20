package com.masai.usecase;

import com.masai.DAO.AccountDao;
import com.masai.DAO.AccountDaoIMPL;
import com.masai.entity.Account;

public class createAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc=new Account(10, "mike@gmail.com", "delhi", 8000);
		
		AccountDao ADAO=new AccountDaoIMPL();
		ADAO.save(acc);

	}

}
