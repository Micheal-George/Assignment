package com.Masai;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Demo {
	
	

	public static void main(String[] args) {
		SortPrice s=new SortPrice();
		SortName n=new SortName();
		SortId i=new SortId();
		Scanner sc=new Scanner(System.in);
		ArrayList<Product> product = new ArrayList<>();
		
		int j=0;
		while(j<2)
		{
			System.out.println("Enter Product Details");
			System.out.println("Product ID");
			int pID=sc.nextInt();
			System.out.println("Product Name");
			String name=sc.next();
			System.out.println("Product Price");
			double pp=sc.nextDouble();
			Product p=new Product(pID,name,pp);
			product.add(p);
			j++;
		
		}
		TreeSet<Product> SP=null;
       System.out.println("Enter 1 or 2 or 3");
       int num=sc.nextInt();
       if(num==1)
       {
    		 SP=new TreeSet<>(s);
    	  for(Product ss:product) {
    		  SP.add(ss);
    	  }
    	  System.out.println("Sorted according to Price");
    	   
    }

       else    if(num==2)
       {
    	    SP=new TreeSet<>(n); 
    	    for(Product ss:product) {
      		  SP.add(ss);
      	  }
      	  System.out.println("Sorted according to Name");
       }
       else   
       {
    	   SP=new TreeSet<>(i); 
    	   for(Product ss:product) {
     		  SP.add(ss);
     	  }
     	  System.out.println("Sorted according to ID");
       }
      
       System.out.println(SP);
	}

}
