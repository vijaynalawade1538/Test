package com.gontuseries.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// For annotation based Controllers we need to add following line in spring config file
// <context:component-scan base-package="com.gontuseries.controllers"/>

@Controller
@RequestMapping("/greet")
public class HelloController {
	
	
	// Example of multiple request mappings
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		
		ModelAndView model = new ModelAndView("Hello");
		model.addObject("msg", "Hello world...");
		
		return model;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld() {
		
		ModelAndView model = new ModelAndView("Hello");
		model.addObject("msg", "Hi world...");
		
		return model;
	}
	
	// Example of PathVariable
	
	@RequestMapping("/hello/{country}/{name}")
	public ModelAndView demo(@PathVariable("name") String name, @PathVariable("country") String country) {
		
		ModelAndView model = new ModelAndView("Hello");
		model.addObject("msg", "Hello "+name+" you are from "+country);
		return model;
		
	}
	
	//Example of PathVariable for multiple variables (i.e. Use Map for PathVariables)
	// For this we need to add one line in Spring configuration file ->  <mvc:annotation-driven/>
	
	@RequestMapping("/helle/{country}/{name}")
	public ModelAndView showAll(@PathVariable Map<?,?> pathVariables) {
		
		String country = (String) pathVariables.get("country");
		String name = (String) pathVariables.get("name");
		
		ModelAndView model = new ModelAndView("Hello");
		model.addObject("msg", "Hello "+name+" you are from "+country);
		return model;
		
	}

}
