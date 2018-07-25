package com.cg.controller;

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

import com.cg.dto.ScheduledSessions;
import com.cg.service.ITrainingService;

@Controller
public class TrainingController {

	@Autowired
	ITrainingService trainingservice;
	@RequestMapping(value="/showall", method=RequestMethod.GET)
	public ModelAndView getAllEmployees()
	{
		List<ScheduledSessions> list=trainingservice.viewSessions();
		return new ModelAndView("ScheduledSessions1","emps",list);
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String myTraining(@ModelAttribute("emp") ScheduledSessions t,Map<String,Object> model)
	{
		model.put("emp",t);
		return "addtraining";
	}
	
	@RequestMapping(value="/addtraining1", method=RequestMethod.POST)
	public String addEmployee(@Valid @ModelAttribute("emp") ScheduledSessions t, BindingResult result,Map<String,Object> model)
	{
		if(result.hasErrors())
			return "addtraining";
		trainingservice.addSessions(t);
		return "redirect:/showall";
	
	}
	

	@RequestMapping(value="/Success1", method=RequestMethod.GET)
	public ModelAndView success2(@ModelAttribute("emp") ScheduledSessions t,Map<String,Object> model)
	{
        List<ScheduledSessions> list = new ArrayList<>();
		
		list.add(t);
		return new ModelAndView("Success","up",t);
}
}
