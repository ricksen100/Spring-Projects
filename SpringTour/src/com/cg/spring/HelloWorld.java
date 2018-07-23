package com.cg.spring;

import java.util.List;

public class HelloWorld {

	private String message;
	private List<Holiday> holiday;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Holiday> getHoliday() {
		return holiday;
	}
	public void setHoliday(List<Holiday> holiday) {
		this.holiday = holiday;
	}
	public void display()
	{
		System.out.println("Your Message");
		for(Holiday h:holiday)
		{
			System.out.println("Month:"+h.getMonth());
			System.out.println("Day:"+h.getDay());
			System.out.println("Greeting:"+h.getGreeting());
		}
	}
}
