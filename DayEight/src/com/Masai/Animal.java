package com.Masai;

public class Animal {
	public void makeNoise(){
	System.out.println("Animal making Noise");
	}
	public void eat(){
	System.out.println("Animal is eating");
	}
	public void walk(){
	System.out.println("Animal is walking");
	}

	public static void main(String[] args) {
	
		Animal[] animal=new Animal[3];
		Dog d=new Dog();
		Cat c=new Cat();
		Tiger T=new Tiger();
		animal[0]=d;
		animal[1]=c;
		animal[2]=T;
		
		
        animal[0].makeNoise();
        animal[0].eat();
        animal[0].walk();
        
        animal[1].makeNoise();
        animal[1].eat();
        animal[1].walk();
        
        animal[2].makeNoise();
        animal[2].eat();
        animal[2].walk();
        
	}

}

class Dog extends Animal{
	@Override
	public void makeNoise(){
		System.out.println("Barking...");
		}
}
class Cat extends Animal{
	@Override
	public void makeNoise(){
		System.out.println("Meaw...");
		}
}
class Tiger extends Animal{
	@Override
	public void makeNoise(){
		System.out.println("Raoring...");
		}
}


