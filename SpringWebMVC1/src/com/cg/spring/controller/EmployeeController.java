package com.cg.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.dto.Employee;
import com.cg.spring.service.EmployeeService;

@Controller
public class EmployeeController {
  
	@Autowired
	EmployeeService employeeService;
	
	//ShowBalance
	@RequestMapping(value="/showall", method=RequestMethod.GET)
	public ModelAndView getAllEmployees()
	{
		List<Employee> list=employeeService.showEmployee();
		return new ModelAndView("show","emps",list);
	}
	
	//For addition
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String myEmployee(@ModelAttribute("emp") Employee emp,Map<String,Object> model)
	{
		model.put("emp",emp);
		return "addemployee";
	}
	
	@RequestMapping(value="/addemployee", method=RequestMethod.POST)
	public String addEmployee(@Valid @ModelAttribute("emp") Employee emp, BindingResult result,Map<String,Object> model)
	{
		if(result.hasErrors())
			return "addemployee";
		employeeService.addEmployee(emp);
		return "redirect:/showall";
	
	}
	
	
	
	//For Updation
	@RequestMapping(value="/update0", method=RequestMethod.GET)
	public String askId(@ModelAttribute("emp") Employee emp,Map<String,Object> model)
	{
		//model.put("emp",emp);
		return "update1";
	}
	
	
	@RequestMapping(value="/update1", method=RequestMethod.POST)
	public ModelAndView myEmployee2(@ModelAttribute("emp") Employee emp,Map<String,Object> model)
	{
		List<Employee> list = new ArrayList<>();
		
		list.add(emp);
		return new ModelAndView("update2","up",emp);
	}
	
	@RequestMapping(value="/update2", method=RequestMethod.POST)
	public String updateEmployee(@Valid @ModelAttribute("emp") Employee emp, BindingResult result,Map<String,Object> model)
	{
		if(result.hasErrors())
			return "update2";
		employeeService.updateEmployee(emp);
		return "redirect:/showall";
	
	}
	
	
	@RequestMapping(value="/delete0", method=RequestMethod.GET)
	public String askId2(@ModelAttribute("emp") Employee emp,Map<String,Object> model)
	{
		//model.put("emp",emp);
		return "delete1";
	}
	
	
	@RequestMapping(value="/delete1", method=RequestMethod.POST)
	public String myEmployee3(@ModelAttribute("emp") Employee emp,Map<String,Object> model)
	{
		int id=emp.getId();
		employeeService.deleteEmployee(id);
		return "redirect:/showall";
	}
	
}
