package com.Masai;

/*
 		final keyword is used to restrict the user from making changes.
 		final can be Variable,Method,Class
 		the final variable must be initialized before we use it
 		-if we use class as final the it cannot be extended
 		-if we use final with variable it acts as constant
 		-if we use final with method it cannot be override
 		
 		
 		finally block is used to execute the necessery code of the program. It is executed whether an exception is handled
 		or not
 		important statement to be printed can be placed inthe finally block
 		
 		only one condition in which finally is not executed is when we use system.exit(); */

public class Qus3 {
	static final int num=10;
	

	public static void main(String[] args) {
		System.out.println(num);
//		num=20;//cannot possible
	try{int sum=10/0;//error will occur here and function will terminate abnormally . but if we
	             //tghe finally statement will execute
	}
finally {
	System.out.println("end");
}
}

}	
