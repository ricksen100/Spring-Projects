package com.cg.spring;

import java.util.List;

public class ShoppingCart {

	private int pid;
	private String pname;
	private int salescount;
	public int getSalescount() {
		return salescount;
	}
	public void setSalescount(int salescount) {
		this.salescount = salescount;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	
	
}
