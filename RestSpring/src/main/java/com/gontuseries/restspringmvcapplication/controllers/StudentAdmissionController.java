package com.gontuseries.restspringmvcapplication.controllers;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gontuseries.restspringmvcapplication.config.StudentNameEditor;
import com.gontuseries.restspringmvcapplication.model.Student;

@Controller
public class StudentAdmissionController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		//binder.setDisallowedFields(new String[] {"studentMobile"});
		SimpleDateFormat date = new SimpleDateFormat("yyyy**mm**dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(date, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
		
	}

	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() throws IOException {

		ModelAndView model = new ModelAndView("AdmissionForm");
		//throw new NullPointerException();
		//throw new IOException();
		return model;
	}
	

	// We can directly use Student Object as @ModelAttribute
	
	@RequestMapping(value = "submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student") Student student, BindingResult result) {
		
		if(result.hasErrors()) {
			ModelAndView model = new ModelAndView("AdmissionForm");
			return model;
		}
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg", "Details submitted are: ");
		return model;
		
	}
	
	@ModelAttribute
	public Model addCommonAttributes(Model model) {
		model.addAttribute("headerMsg", "Student Admission Form for Engineering, India");
		return model;
	}
	
	
}
