package com.masai.utility;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMconnector {

		
	private static EntityManagerFactory emf;
		
		static{
			emf=Persistence.createEntityManagerFactory("library");
		}
		
		public static EntityManager provideEntityManager(){
			
			
			
			return emf.createEntityManager();
		}


}