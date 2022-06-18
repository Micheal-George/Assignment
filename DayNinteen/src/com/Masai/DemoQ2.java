package com.Masai;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap< String, String> hm=new HashMap<>();
		hm.put("Kerala", "Trivandrum");
		hm.put("Tamil_Nadu", "Chennai");
		hm.put("Karnataka", "Banglore");
		hm.put("West Bengal", "Kolkata");
		hm.put("Maharashtra", "Mumbai");
		
		Set<Map.Entry<String,String>> set =hm.entrySet();
		
		for(Map.Entry<String,String> ME: set)
		{
		System.out.println(ME.getKey()+"---------->capital------->"+ME.getValue());	
		}
		
	}

}
