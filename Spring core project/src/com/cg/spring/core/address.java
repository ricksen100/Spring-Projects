package com.cg.spring.core;

public class address {
   private String street;
   private String city;
   private String state;
   
public void setStreet(String street) {
	this.street = street;
}
public void setCity(String city) {
	this.city = city;
}
public void setState(String state) {
	this.state = state;
}
public String getStreet() {
	return street;
}
public String getCity() {
	return city;
}
public String getState() {
	return state;
}
public void display()
{
	System.out.println(getStreet()+""+getCity()+""+getState());
}
   
}
