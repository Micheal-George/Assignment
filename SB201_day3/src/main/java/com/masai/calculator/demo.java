package com.masai.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx= new AnnotationConfigApplicationContext(configApp.class);
		
		presentationLayer ps=ctx.getBean(presentationLayer.class,"p");
		ps.sumofNumbers();
		ps.multiplicationofNumbers();
		ps.substractionofNumbers();

	}

}
