package com.masai.entity;

import javax.persistence.EntityManager;

import com.masai.utility.EMconnector;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManager em=EMconnector.provideEntityManager();
		
		Employee emp=new Employee();
		emp.setEname("micheal");
		emp.setAddress("Kerala");
		emp.setSalary(100000);
		
		Employee emp1=new Employee();
		emp1.setEname("Sam");
		emp1.setAddress("Delhi");
		emp1.setSalary(350000);
		
		Employee emp2=new Employee();
		emp2.setEname("Tom");
		emp2.setAddress("Mumbai");
		emp2.setSalary(850000);
		
		Department dept=new Department();
		dept.setDname("HR");
	    dept.setLocation("Delhi");
	    dept.getEmps().add(emp);
	    dept.getEmps().add(emp1);
	    dept.getEmps().add(emp2);
	    
	    em.getTransaction().begin();
	    em.persist(dept);
	    em.getTransaction().commit();
	    em.close();
	    
	    System.out.println("Done");
		
	}

}
