package com.masai.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Emanager {
	
private static EntityManagerFactory emf;
	
	static{
		emf=Persistence.createEntityManagerFactory("account");
	}
	
	public static EntityManager provideEntityManager(){
		
		
		
		return emf.createEntityManager();
	}

}
