package com.gontuseries.restspringmvcapplication.controllers;

import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gontuseries.restspringmvcapplication.model.Student;

@RestController
public class StudentInfoRestAPIController {

	
	@RequestMapping(value = "/students", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
	public ArrayList<Student> getStudentList(){
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		student1.setStudentName("Vijay");
		student2.setStudentName("Sangram");
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

	// ResponseEntity is used for sending status code to the client
	
	@RequestMapping(value = "/students/{name}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> updateStudent(@PathVariable("name") String name, @RequestBody Student student){
		
		System.out.println("Student Name: "+name);
		System.out.println("Student Name: "+student.getStudentName()+" Student Hobby: "+student.getStudentHobby());
		
		//find the matching student record using "studentName" from the DB
		//Update the matching student record with the information of student sent by the client
		
		//return true if record successfully updated into the DB and false for failed update
		
		HttpHeaders httpHeaders = new HttpHeaders();
		
		httpHeaders.add("key1","value1");
		httpHeaders.add("key2","value2");
		
		
		return new ResponseEntity<Boolean>(true, httpHeaders,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/students/{name}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> deleteStudent(@PathVariable("name") String name){
		
		System.out.println("Student Name:"+name);
		//Delete student record from DB
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/students/{name}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> addStudent(@PathVariable("name") String name){
		
		System.out.println("Student Name:"+name);
		//Insert the student record into DB
		return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
	}
}
