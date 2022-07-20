package com.masai.entity;

import javax.persistence.EntityManager;

import com.masai.utility.EMconnector;

public class Adddetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em=EMconnector.provideEntityManager();
		
		Employee emp1=new Employee();
		emp1.setName("Mike");
		emp1.setGender("Male");
		emp1.setSalary(50000);
		Address add1=new Address("Kerala", "kochi", "686105", "A");
		emp1.getEmpAddress().add(add1);
		
		Employee emp2=new Employee();
		emp2.setName("Sam");
		emp2.setGender("Male");
		emp2.setSalary(78000);
		Address add2=new Address("Delhi", "Delhi", "789105", "A");
		emp2.getEmpAddress().add(add2);
		
		Employee emp3=new Employee();
		emp3.setName("John");
		emp3.setGender("Male");
		emp3.setSalary(59000);
		Address add3=new Address("Tamilnadu", "Chennai", "789185", "A");
		emp3.getEmpAddress().add(add3);
		
		Employee emp4=new Employee();
		emp4.setName("Jewel");
		emp4.setGender("Female");
		emp4.setSalary(158000);
		Address add4=new Address("Maharashtra", "Mumbai", "784125", "A");
		emp4.getEmpAddress().add(add4);
		
		em.getTransaction().begin();
		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		em.persist(emp4);
		em.getTransaction().commit();
		
		em.close();
		System.out.println("Done");

	}

}
