package com.Masai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudMarks sm=new StudMarks();
		HashMap<String,Student> hm = new HashMap();
		hm.put("Maharastra",new Student(10,"Ganesh",950));
		hm.put("Tamilnadu",new Student(12,"Surya",850));
		hm.put("Telangana",new Student(15,"Venkat",920));
		hm.put("Haryana",new Student(16,"Dinesh",910));
		hm.put("Kerla",new Student(18,"Srinu",880));
		
		
		Set<Map.Entry<String,Student>> set = hm.entrySet();
		
		Set<Map.Entry<String,Student>> Tree=new TreeSet<>(sm);
		
		for(Map.Entry<String,Student> me: set) {
			Tree.add(me);
		}
		
		for(Map.Entry<String,Student> T: Tree) {
		
		
		Student student = T.getValue();
		System.out.println("Toppers Student of State :" + T.getKey()+"---------->"+"Roll :" + student.getRoll()+" , "+"Name :" + student.getName()+" , "+"Marks :" + student.getMark());
		
	}
	}
}
