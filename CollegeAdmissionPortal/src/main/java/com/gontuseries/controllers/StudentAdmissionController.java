package com.gontuseries.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value = "/admissonForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;

	}

	@RequestMapping(value = "submitAdmissionForm.html", method = RequestMethod.POST)
	/*
	 * public ModelAndView submitAdmissionForm(@RequestParam(value = "studentName",
	 * defaultValue = "Sunny") String name,
	 * 
	 * @RequestParam("studentHobby") String hobby) {
	 */
	public ModelAndView submitAdmissionForm(@RequestParam Map<?, ?> requestParam) {
		
		String name = (String) requestParam.get("studentName");
		String hobby = (String) requestParam.get("studentHobby");
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg", "Details submitted: Name = " + name + " & Hobby = " + hobby);
		return model;

	}
}
