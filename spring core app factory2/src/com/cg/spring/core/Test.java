package com.cg.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Employee t=(Employee)factory.getBean("employee");
		t.display();*/
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Customer t1=(Customer)context.getBean("customer");
		t1.show();
		Employee t2=(Employee)context.getBean("employee");
		t2.display();
		Student t3=(Student)context.getBean("student");
		t3.display();
	}

}
