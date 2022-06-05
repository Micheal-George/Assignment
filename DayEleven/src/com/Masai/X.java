package com.Masai;

public interface X {
	
	void method1();
	
	default void method2() {
		System.out.println("inside default method in interface X");
	}
	
	static void method3() {
		System.out.println("inside static method3 in interface X");
	}

}
