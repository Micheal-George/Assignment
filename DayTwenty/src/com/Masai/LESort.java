package com.Masai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class LESort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList();
		list.add("Delhi");
		list.add("Maharashtra");
		list.add("Goa");
		list.add("Kerala");
		list.add("Punjab");
		Collections.sort(list,(l1,l2)->l2.compareTo(l1));
		System.out.println(list);
	}

}
