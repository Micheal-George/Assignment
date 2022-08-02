package com.masai.calculator;

import org.springframework.stereotype.Service;

@Service
public class serviceLayer {

	public int sum(int a, int b)
	{
		return a+b;
	}
	
	public int multiplication(int a, int b)
	{
		return a*b;
	}
	
	public int substraction(int a, int b)
	{
		return a-b;
	}
}
