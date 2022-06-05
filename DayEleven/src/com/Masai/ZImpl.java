package com.Masai;

public class ZImpl implements  Z {

	@Override
	public void method1() {
		System.out.println("inside method1 in class ZImpl");
		
	}

	@Override
	public void methodA() {
		System.out.println("inside methodA in class ZImpl");
		
	}

	@Override
	public void methodZ() {
		System.out.println("inside methodZ in class ZImpl");
		
	}
	@Override
	public void method2() {
		System.out.println("inside method2 in class ZImpl");
	}
	
	public static void main(String[] args) {
		Z z=new ZImpl();
		z.method1();
		z.method2();
		z.methodA();
		z.methodB();
		X.method3();
		Y.methodC();
	}

}
