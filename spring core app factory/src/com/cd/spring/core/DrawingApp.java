package com.cd.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // Triangle triangle=new Triangle();
     // triangle.draw();
		/*BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle t=(Triangle)factory.getBean("triangle");
		t.draw();*/
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle t=(Triangle)context.getBean("triangle");
		t.draw();
	}

}
