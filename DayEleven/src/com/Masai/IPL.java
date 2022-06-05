package com.Masai;

import java.util.Scanner;

public class IPL {

	void homeTeamStadium(Stadium stadium) 
	{
		switch(stadium) {
		case EDEN_GARDENS_STADIUM :
			System.out.println("This is the home ground of KKR");
			break;
		case WANKHEDE_STADIUM:
			System.out.println("This is the home ground of  Mumbai Indians");
			break;
		case CHIDAMBARAM_STADIUM :
			System.out.println("This is the home ground of csk");
			break;
		case M_CHINNASWAMY_STADIUM :
			System.out.println("This is the home ground of RCB");
			break;
		
		default :
			System.out.println("noooo");
		}


	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter stadium name");
		String stadiumName=sc.next();
		IPL i=new IPL();
		if(stadiumName.equalsIgnoreCase("EDEN_GARDENS_STADIUM"))
			i.homeTeamStadium(Stadium.EDEN_GARDENS_STADIUM);
	
		else if(stadiumName.equalsIgnoreCase("WANKHEDE_STADIUM"))
			i.homeTeamStadium(Stadium.WANKHEDE_STADIUM);
		
		else if(stadiumName.equalsIgnoreCase("CHIDAMBARAM_STADIUM"))
			i.homeTeamStadium(Stadium.CHIDAMBARAM_STADIUM);
		
		else if(stadiumName.equalsIgnoreCase("M_CHINNASWAMY_STADIUM"))
			i.homeTeamStadium(Stadium.M_CHINNASWAMY_STADIUM );
		else
			System.out.println("Enter valid Name");
		

	}

}
