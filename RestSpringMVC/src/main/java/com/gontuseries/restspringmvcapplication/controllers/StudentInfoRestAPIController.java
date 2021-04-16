package com.gontuseries.restspringmvcapplication.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gontuseries.restspringmvcapplication.model.Student;

@RestController
public class StudentInfoRestAPIController {
	
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public ArrayList<Student> getStudentList(){
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student student1 = new Student();
		student1.setStudentName("Vijay");
		Student student2 = new Student();
		student2.setStudentName("Sangram");
		Student student3 = new Student();
		student3.setStudentName("Harshal");
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		return studentList;
	}
	
	@RequestMapping("/students/{name}")
	public Student getStudent(@PathVariable("name") String name) {
		Student student = new Student();
		student.setStudentName(name);
		student.setStudentHobby("WWE");
		return student;
	}

}
