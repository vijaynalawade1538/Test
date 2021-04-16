package com.gontuseries.restspringmvcapplication.controllers;

import java.io.IOException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandlerController {
	@ExceptionHandler(value = NullPointerException.class)
	public String nullPointerException(Exception e) {
		System.out.println("Null Poiner Excepption Occured: "+e);
		return "NullPointerException";
	}
	
	@ExceptionHandler(value = IOException.class)
	public String ioException(Exception e) {
		System.out.println("IO Excepption Occured: "+e);
		return "IOException";
	}

}
