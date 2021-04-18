package com.gontuseries.restspringmvcapplication.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class WebServletConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Application configured using Projectconfig class");
		
		return new Class<?>[] {
			ProjectConfig.class
		};
	}
	
	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}
}
