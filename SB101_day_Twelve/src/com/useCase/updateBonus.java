package com.useCase;

import java.sql.SQLException;
import java.util.Scanner;

import com.Exception.EmployeeException;
import com.masai.Dao.empDao;
import com.masai.Dao.empDaoIMPL;

public class updateBonus {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bonus Amount");
		int bonus= sc.nextInt();
		
		empDao emp=new empDaoIMPL();
		
			String msg=emp.updateBonus(bonus);
			System.out.println(msg);
		

	}


	

}
