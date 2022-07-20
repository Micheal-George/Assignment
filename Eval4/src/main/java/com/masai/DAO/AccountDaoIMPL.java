package com.masai.DAO;

import javax.persistence.EntityManager;

import com.masai.entity.Account;
import com.masai.exceptionHandling.InsufficientBalance;
import com.masai.exceptionHandling.InvalidAccount;
import com.masai.util.Emanager;

public class AccountDaoIMPL implements AccountDao{

	@Override
	public void save(Account account) {
		// TODO Auto-generated method stub
        String s="Not";
		
		EntityManager em= Emanager.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(account);
		s="";
		
		em.getTransaction().commit();
		
		
		em.close();
		
		System.out.println("Account is "+s+"Created");
		
	}

	@Override
	public Account findById(int id) throws InvalidAccount {
		// TODO Auto-generated method stub
		EntityManager em=Emanager.provideEntityManager();
		
		 
	 	Account acc = em.find(Account.class, id);
	 	if(acc==null)
	 	{
	 		throw new InvalidAccount("Account with this id "+id+" doesnot exist");
	 	}
	 	
	 	
	 	return acc;
	 	
	 	
	 	
	}

	@Override
	public void update(Account account) throws InvalidAccount {
		// TODO Auto-generated method stub

	String s="Not";
		
		EntityManager em= Emanager.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.merge(account);
		s="";
		
		em.getTransaction().commit();
		
		
		em.close();
		
		System.out.println("Account is "+s+" Updated");
		
	}

	@Override
	public void remove(Account account) throws InvalidAccount {
		// TODO Auto-generated method stub
		
boolean flag=false;
		
String s="Not";
		EntityManager em= Emanager.provideEntityManager();
		
		Account acc=em.find(Account.class, account.getId());
		
		if(acc != null){
			
			em.getTransaction().begin();
			
			em.remove(acc);
			s="";
			
			em.getTransaction().commit();
		}
		else
			throw new InvalidAccount("Account dosenot Exist");
		
		em.close();
		
		
		
		System.out.println("Account is "+s+" deleted");
		
	}

	@Override
	public int withdraw(double amount, Account account) throws InsufficientBalance, InvalidAccount {
		// TODO Auto-generated method stub
		
EntityManager em= Emanager.provideEntityManager();
		int s=0;
		Account acc=em.find(Account.class, account.getId());
		
		if(acc != null){
			if(amount<=account.getBalance())
			{
				em.getTransaction().begin();
				
				acc.setBalance(acc.getBalance()-amount);
				s=1;
				
				em.getTransaction().commit();
			}
			else
				throw new InsufficientBalance("Insufficient Balance");
			
		}
		else
			throw new InvalidAccount("Account dosenot Exist");
		
		em.close();
		return s;
	}

	

	@Override
	public String deposit(double amount, Account account) throws InvalidAccount {
		// TODO Auto-generated method stub
		String s="Amount Not Deposited";
		
		
		EntityManager em= Emanager.provideEntityManager();
		
		Account acc=em.find(Account.class, account.getId());
		
		if(acc != null){
			
			em.getTransaction().begin();
			
		acc.setBalance(acc.getBalance()+amount);
			s="Amount Deposited";
			
			em.getTransaction().commit();
		}
		else
			throw new InvalidAccount("Account dosenot Exist");
		
		em.close();
		
		return s;
	}

}
