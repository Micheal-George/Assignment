package com.Masai;

class Parrot extends Bird{
	@Override
	public void fly(){
		System.out. println("I am Flying");
		}
	
	public void sing(){
		System.out.println("I am Singing");
	}
	
}



public class Bird {
	
	
	public void fly(){
		System.out. println("Bird is flying");
		}

	public static void main(String[] args) {
		Bird b1 = new Parrot();//upcasting
         b1.fly();
         Parrot p=(Parrot)b1;//downcasting
         p.sing();
        

	}

}
