package com.Masai;

import java.util.Comparator;
import java.util.Scanner;

public  class SortPrice implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getProductPrice()>p2.getProductPrice())
			return 1;
			else if(p1.getProductPrice()<p2.getProductPrice())	
				return -1;
				else	
		return 0;
	}
}
