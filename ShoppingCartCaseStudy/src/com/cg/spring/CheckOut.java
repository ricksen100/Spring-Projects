package com.cg.spring;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CheckOut {

	private List<ShoppingCart> product;
	
	
	
	public List<ShoppingCart> getProduct() {
		return product;
	}


	public void setProduct(List<ShoppingCart> product) {
		this.product = product;
	}


	

	public void display()
	{
	    System.out.println("Details");
		product=product.stream().sorted(Comparator.comparing(ShoppingCart::getSalescount).reversed()).collect(Collectors.toList());
		product.forEach(e->System.out.println("id:"+e.getPid()+", Name:"+e.getPname()+", Sales count:"+e.getSalescount()));
		
		
		
		
	}
	
	
}
