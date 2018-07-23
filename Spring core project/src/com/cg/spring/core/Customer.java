package com.cg.spring.core;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer {
private int id;
private String name;
private address addr;

private Map<String,String> product_reviews;


public Map<String, String> getProduct_reviews() {
	return product_reviews;
}
public void setProduct_reviews(Map<String, String> product_reviews) {
	this.product_reviews = product_reviews;
}
private List<Product> product;

public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}

public List<Product> getProduct() {
	return product;
}
public void display()
{
	System.out.println(getId()+""+getName());
}
public void setAddr(address addr) {
	this.addr = addr;
}

public address getAddr() {
	return addr;
}
public void setProduct(List<Product> product) {
	this.product = product;
}
public void display1()
{
	System.out.println("Customer Address");
	System.out.println(getAddr().getStreet()+""+getAddr().getCity()+""+getAddr().getState());
	System.out.println("Your Orders");
	for(Product p:product)
	{
		System.out.println("Id:"+p.getId());
		System.out.println("Name:"+p.getPname());
		System.out.println("Price"+p.getPrice());
	}
	System.out.println("----------------------");
	System.out.println("Product Reviews");
	Set s=product_reviews.keySet();
	Iterator it=s.iterator();
	while(it.hasNext())
	{
		String p=(String) it.next();
		System.out.println(p+"-"+product_reviews.get(p));
	}
}


}
