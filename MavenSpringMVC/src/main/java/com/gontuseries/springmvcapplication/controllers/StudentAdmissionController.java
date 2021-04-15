package com.gontuseries.springmvcapplication.controllers;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gontuseries.springmvcapplication.config.StudentNameEditor;
import com.gontuseries.springmvcapplication.model.Student;

@Controller
public class StudentAdmissionController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		//binder.setDisallowedFields(new String[] {"studentMobile"});
		SimpleDateFormat date = new SimpleDateFormat("yyyy**mm**dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(date, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
		
	}

	@RequestMapping(value = "/admissonForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		ModelAndView model = new ModelAndView("AdmissionForm");
		//throw new NullPointerException();
		return model;
	}
	
	@ExceptionHandler(value = NullPointerException.class)
	public String nullPointerException(Exception e) {
		System.out.println("Null Poiner Excepption Occured: "+e);
		return "NullPointerException";
	}

	
	
	// Receive attributes from AdmissionForm.jsp
	/*
	 * @RequestMapping(value = "submitAdmissionForm.html", method = RequestMethod.POST) 
	 * public ModelAndView submitAdmissionForm1(@RequestParam(value = "studentName", defaultValue = "Sunny") String name, 
	 * 											@RequestParam("studentHobby") String hobby) {
	 * 
	 * ModelAndView model = new ModelAndView("AdmissionSuccess1");
	 * model.addObject("msg","Details submitted: Name = "+name+" & Hobby = "+hobby);
	 * return model; }
	 * 
	 */ 
	
	// Receive attributes from AdmissionForm.jsp in a Map
	
	/*
	 * @RequestMapping(value = "submitAdmissionForm.html", method = RequestMethod.POST) 
	 * public ModelAndView submitAdmissionForm(@RequestParam Map<?, ?> requestParam) {
	 * 
	 * String name = (String) requestParam.get("studentName"); String hobby =
	 * (String) requestParam.get("studentHobby");
	 * 
	 * ModelAndView model = new ModelAndView("AdmissionSuccess1");
	 * model.addObject("msg", "Details submitted: Name = " + name + " & Hobby = " +
	 * hobby); return model;
	 * 
	 * }
	 */
	
	// ModelAttribute Example ->
	/*
	 * @RequestMapping(value = "submitAdmissionForm.html", method =
	 * RequestMethod.POST) public ModelAndView
	 * submitAdmissionForm(@RequestParam("studentName") String studentName,
	 * 
	 * @RequestParam("studentHobby") String studentHobby) {
	 * 
	 * Student student = new Student(); student.setStudentName(studentName);
	 * student.setStudentHobby(studentHobby);
	 * 
	 * ModelAndView model = new ModelAndView("AdmissionSuccess");
	 * model.addObject("msg", "Details submitted are: "); model.addObject(student);
	 * return model;
	 * 
	 * }
	 */

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
