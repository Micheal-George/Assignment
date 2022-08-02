package com.masai.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller(value="p")
public class presentationLayer {
	
	@Value("${a}")
	int a;
	
	@Value("${b}")
	int b;

	public void setA(int a) {
		this.a = a;
	}


	public void setB(int b) {
		this.b = b;
	}
  
	@Autowired
	public void setS(serviceLayer s) {
		this.s = s;
	}

	serviceLayer s;

	public void sumofNumbers()
	{
		
		System.out.println("Sum of Numbers "+a+" "+b+" is "+s.sum(a, b));
	}
	
	public void multiplicationofNumbers()
	{
		
		System.out.println("Multiplication of Numbers "+a+" "+b+" is "+s.multiplication(a, b));
	}
	
	public void substractionofNumbers()
	{
		
		System.out.println("substraction of Numbers "+a+" "+b+" is "+s.substraction(a, b));
	}

}
