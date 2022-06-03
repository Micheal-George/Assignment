package com.Dayten;

public  class TajHotel implements Hotel {

	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
		}

	@Override
	public void chickenBiryani() {
	
		System.out.println("Chicken Biriyani from TajHotel");
		
	}

	@Override
	public void masalaDosa() {
		System.out.println("Masal Dosa from Taj Hotel");
		
	}
}
