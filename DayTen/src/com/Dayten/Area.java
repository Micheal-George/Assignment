package com.Dayten;

import java.util.Scanner;

public class Area extends Shape {

	public static void main(String[] args) {
		
		Area A=new Area();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length and Breadth of Rectangle");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		
		System.out.println("Enter side of Square");
		int side=sc.nextInt();
		
		System.out.println("Enter Radius of Circle");
		int radius=sc.nextInt();
		
		int circ=A.circleArea(radius);
		int rect=A.rectangleArea(length, breadth);
		int sqr=A.squareArea(side);
		
		A.RectangleArea(rect);

		A.SquareArea(sqr);
		A.CircleArea(circ);
	}

	@Override
	public int rectangleArea(int length, int breadth) {
		return length*breadth;
	}

	@Override
	public int squareArea(int side) {
		
		return side*side;
	}

	@Override
	public int circleArea(int radius) {
		// TODO Auto-generated method stub
		return (int)3.14*radius*radius;
	}

	
	public void RectangleArea(int rect) {
		System.out.println("Area of Rectangle = "+rect);
	}

	
	public void SquareArea(int side) {
		
		System.out.println("Area of Square = "+side);
	}

	public void  CircleArea(int cir) {
		
		System.out.println("Area of Circle = "+cir);
	}
}
