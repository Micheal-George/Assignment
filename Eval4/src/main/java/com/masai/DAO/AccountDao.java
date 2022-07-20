package com.masai.DAO;

import com.masai.entity.Account;
import com.masai.exceptionHandling.InsufficientBalance;
import com.masai.exceptionHandling.InvalidAccount;

public interface AccountDao {
	

		void save(Account account);
		
		Account findById(int id) throws InvalidAccount;
		
		void update(Account account) throws InvalidAccount;
		
		void remove(Account account) throws InvalidAccount;
		
		int withdraw(double amount, Account account) throws InsufficientBalance, InvalidAccount ;
		
		String deposit(double amount, Account account) throws InvalidAccount;
		

}
