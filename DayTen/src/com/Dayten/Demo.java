package com.Dayten;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount)
	{
		if(amount>1000)
		{
			TajHotel t=new TajHotel();
			return t;
		}
		else if(amount>200&&amount<1000)
		{
			 RoadSideHotel R=new  RoadSideHotel();
			 return R;
		}
		else
		{
			return null;
		}
	}
	public static void main(String[] args) {
		
		Demo D= new Demo();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount");
		int amount=sc.nextInt();
		
		Hotel h=D.provideFood(amount);
		if(h instanceof TajHotel)
		{
			TajHotel t=(TajHotel)h;
	        t.welcomeDrink();	
	        t.chickenBiryani();
	        t.masalaDosa();
		}
		else if(h instanceof RoadSideHotel)
		{
			RoadSideHotel r=(RoadSideHotel)h;
	        r.chickenBiryani();
	        r.masalaDosa();
		}
		else
		{
			System.out.println("Enter valid amount");
		}
        
	}

}
