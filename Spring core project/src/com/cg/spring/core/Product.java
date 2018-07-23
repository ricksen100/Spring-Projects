package com.cg.spring.core;

public class Product {

	private int id;
	private String pname;
	private double price;
	public void setId(int id) {
		this.id = id;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getPname() {
		return pname;
	}
	public double getPrice() {
		return price;
	}
	public void display2()
	{
		System.out.println(getId()+""+getPname()+""+getPrice());
	}
}
