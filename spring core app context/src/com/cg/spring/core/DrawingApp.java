package com.cg.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		 Circle c=(Circle)context.getBean("circle");
		 c.draw();
	}

}
