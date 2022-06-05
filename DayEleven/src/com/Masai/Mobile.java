package com.Masai;

public class Mobile {
	String[] outdatedModels = {"note4","note5","note6","note7"};

	 void searchOutdatedModel(String company,String... value)
	{
		 System.out.println("Brand Name :"+company);
		for(String X: outdatedModels)
		{
			for(String Y : value) {
				if(X==Y) {
					System.out.println(X+"_OUTDATED");
				}
			
			}
		
		}
	}
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.searchOutdatedModel("SAMSUNG");
		System.out.println("----------------------");
		m.searchOutdatedModel("SAMSUNG","note4","note5","note10");
		System.out.println("----------------------");
		m.searchOutdatedModel("SAMSUNG","note14","note15","note10");
		System.out.println("----------------------");
	}
}
