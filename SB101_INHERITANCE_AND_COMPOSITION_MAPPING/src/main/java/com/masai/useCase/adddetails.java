package com.masai.useCase;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import com.masai.entity.Address;
import com.masai.entity.Employee;
import com.masai.utility.EMconnector;

public class adddetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em=EMconnector.provideEntityManager();
		
		Employee emp1=new Employee();
		emp1.setName("Micheal");
		emp1.setSalary(50000);
		emp1.setHomeAddress(new Address("Kerala","Kochi", "686105"));
		emp1.setOfficeAddress(new Address("UP", "Agra","687458"));
		
		Employee emp2=new Employee();
		emp2.setName("Shameem");
		emp2.setSalary(75000);
		emp2.setHomeAddress(new Address("UP", "Agra","687458"));
		emp2.setOfficeAddress(new Address("Kerala","Kochi", "686105"));
		
		Employee emp3=new Employee();
		emp3.setName("Zafal");
		emp3.setSalary(90000);
		emp3.setHomeAddress(new Address("Karnataka","Bangalore", "786105"));
		emp3.setOfficeAddress(new Address("UP", "Lucknow","894567"));
		
		Employee emp4=new Employee();
		emp4.setName("Mathew");
		emp4.setSalary(50000);
		emp4.setHomeAddress(new Address("Kerala","Kottayama", "686105"));
		emp4.setOfficeAddress(new Address("Karnataka","Bangalore", "786105"));
		
		em.getTransaction().begin();
		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		em.persist(emp4);
		em.getTransaction().commit();
		em.close();
		System.out.println("done");
		
	}

}
