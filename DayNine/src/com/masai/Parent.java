package com.masai;

import java.util.Scanner;

public class Parent {
	
	final int Num;
  public Parent(int Num) {
	   this.Num=Num;
   }
  

  
      void method1() {
		System.out.println("Method1 belong to Parent class"+Num);
	}

final void method2() {
	System.out.println("Method2 belong to Parent class");
	}
void method3() {
	System.out.println("Method3 belong to Parent class");
}

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int N=sc.nextInt();
		String  ff=sc.next();
		if(N>=1&&N<=10)
		{	Parent p=new Child(N);
		Child C=(Child)p;
		C.method1();
		C.method2();
		C.method3();
		C.method4();
		}
		else
		{
			System.out.println("Invalid Number");
		}

	}

}

final class Child extends Parent{
	
	public Child(int Num) {
		super(Num);
	}
	@Override
	void method1() {
		System.out.println("Method1 belong to Child class  "+ "  Value : "+Num);
	}
	@Override
void method3() {
	System.out.println("Method3 belong to Child class");
}
	void method4() {
		System.out.println("Method4 belong to Child class");
	}
	
}

class grandChild extends Parent{
	public grandChild (int Num) {
		super(Num);
	}
	
}