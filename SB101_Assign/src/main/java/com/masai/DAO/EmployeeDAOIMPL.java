package com.masai.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.entity.Employee;

import com.masai.utility.EMconnector;
import com.mysql.cj.Query;

public class EmployeeDAOIMPL implements EmployeeDAO{

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		EntityManager em= EMconnector.provideEntityManager();
		String jpql= "from Employee";
javax.persistence.Query q= em.createQuery(jpql);
		
		List<Employee> list= q.getResultList();
		
			
		return list;
	}

	public String getAddressOfEmployee(int empId) {
		String s="";
		
		EntityManager em= EMconnector.provideEntityManager();
		
		Employee emp=em.find(Employee.class, empId);
		
		if(emp != null){
			
		s=emp.getAddress();
		
		}
		// TODO Auto-generated method stub
		return s;
	}

	public String giveBonusToEmployee(int empId, int bonus) {
String s="Not Updated";
		
		EntityManager em= EMconnector.provideEntityManager();
		
		Employee emp=em.find(Employee.class, empId);
		
		if(emp != null){
			
			em.getTransaction().begin();
			emp.setSalary(emp.getSalary()+bonus);
		s="updated";
		em.getTransaction().commit();
		}
		// TODO Auto-generated method stub
		em.close();
		return s;
	}

	public boolean deleteEmployee(int empId) {
		boolean flag=false;
		
				EntityManager em= EMconnector.provideEntityManager();
				
				Employee emp=em.find(Employee.class, empId);
				
				if(emp != null){
					
					em.getTransaction().begin();
					
					em.remove(emp);
				flag=true;
					
					em.getTransaction().commit();
				}
				
				
				em.close();
		
		return flag;
	}

	public String[] getNameAndAddress(int empId) {
		
		String[] s=new String[2];
		
		EntityManager em= EMconnector.provideEntityManager();
		
		Employee emp=em.find(Employee.class, empId);
		
		if(emp != null){
			s[0]=emp.getName();
		s[1]=emp.getAddress();
		
		}
		// TODO Auto-generated method stub
		return s;
	}

}
