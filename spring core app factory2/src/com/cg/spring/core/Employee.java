package com.cg.spring.core;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	 public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display()
     {
    	 System.out.println("employee details");
    	 System.out.println(getId()+""+getName()+""+getSalary());
     }
}
