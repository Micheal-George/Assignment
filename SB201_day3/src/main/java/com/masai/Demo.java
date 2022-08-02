package com.masai;


import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Demo {
	
	private List<Student> students;
	public void setStudents(List<Student> students) {
	this.students = students;
	}
	public List<Student> getStudents() {
	return students;
	}


	
	
	List<String> cities;
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	
	
	Map<Student, String> theMap;
	
	public void setTheMap(Map<Student, String> theMap) {
		this.theMap = theMap;
	}
	
	public Map<Student, String> getTheMap() {
		return theMap;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext cxt =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Demo d=cxt.getBean(Demo.class,"D");
		List<Student> students=d.getStudents();
		for(Student s:students)
		{
			System.out.println(s);
			System.out.println("===========================================");
		}
		
		List<String> city=d.getCities();
		for(String s: city)
		{
			System.out.println(s);
			System.out.println("===========================================");
		}
		
		
		
		
		Map<Student, String> theMap=d.getTheMap();
		Set<Map.Entry<Student, String>> set=theMap.entrySet(); 
		for(Map.Entry<Student, String> m: set)
		{
			System.out.println(m.getKey()+"======"+m.getValue());
			System.out.println("===========================================");
		}
		
		
	}

	
	

}
