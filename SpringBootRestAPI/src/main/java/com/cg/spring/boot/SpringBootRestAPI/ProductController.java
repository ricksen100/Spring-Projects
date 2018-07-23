package com.cg.spring.boot.SpringBootRestAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	List<Product> products=new ArrayList<>(Arrays.asList(
			new Product("ip01","Iphone","Iphone6s",45000.00),
			new Product("s01","Samsung","Samsung Galaxy",79000.00)
			));
	
	
	@RequestMapping("/products")
	public List<Product> getAllProducts()
	{
		return products;
	}
	@RequestMapping("/products/{id}")
	public Product getProduct(@PathVariable String id)
	{
		for(Product p:products)
		{
			if(p.getId().equals(id))
			{
				return p;
			}
			
		}
		return null;
	}
	@RequestMapping(method=RequestMethod.POST,value="/products")
	public void addProduct(@RequestBody Product p)
	{
		products.add(p);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/products/{id}")
	public void updateProduct(@RequestBody Product p,@PathVariable String id)
	{
		for(int i=0;i<products.size();i++)
		{
			if(products.get(i).getId().equals(id))
			{
				products.set(i,p);
			}
		}
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/products/{id}")
	public void deleteProducts(@PathVariable String id)
	{
		for(int i=0;i<products.size();i++)
		{
			if(products.get(i).getId().equals(id))
			{
				products.remove(i);
			}
		}
    }
}