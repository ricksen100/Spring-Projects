package com.cg.spring.boot.SpringBootRestAPI;

public class Product {
  private String id;
  private String name;
  private String model;
  private double price;

  public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Product()
  {
	  
  }

public Product(String id, String name, String model, double price) {
	super();
	this.id = id;
	this.name = name;
	this.model = model;
	this.price = price;
}

}
