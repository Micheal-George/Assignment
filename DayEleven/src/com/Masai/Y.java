package com.Masai;

public interface Y {
	void methodA();
	
	default void methodB() {
		System.out.println("inside default methodB in interface Y");
	}
	
	static void methodC() {
		System.out.println("inside static methodC in interface Y");
	}

}
