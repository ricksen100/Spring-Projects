package com.cg.spring.core;

public class Student {
 
     private int id;
     private String name;
     private String course;
	public Student(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
     
     public void display()
     {
    	 System.out.println("Student Details");
    	 System.out.println(id+" "+name+" "+course);
     }
}
