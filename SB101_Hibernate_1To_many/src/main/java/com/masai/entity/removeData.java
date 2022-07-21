package com.masai.entity;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.utility.EMconnector;

public class removeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManager em=EMconnector.provideEntityManager();
		
Department dept=em.find(Department.class, 1);
		
		
		List<Employee> emp=dept.getEmps();
		
		for(Employee s: emp)
		{
		if(s.getEmpID()==2)
		{
			System.out.println(s);
		}
		}

	}

}
