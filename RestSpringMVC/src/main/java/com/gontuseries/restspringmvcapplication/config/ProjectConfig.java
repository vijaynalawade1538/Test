package com.gontuseries.restspringmvcapplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.gontuseries.restspringmvcapplication.model.Address;
import com.gontuseries.restspringmvcapplication.model.Student;

@EnableWebMvc
@ComponentScan(basePackages = "com.gontuseries.restspringmvcapplication.controllers")
public class ProjectConfig extends WebMvcConfigurationSupport{

	@Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
	
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		
		ReloadableResourceBundleMessageSource bundleMessageSource = new ReloadableResourceBundleMessageSource();
		bundleMessageSource.setBasename("/WEB-INF/studentmessages");
		return bundleMessageSource;
	}
	
	@Bean
	public Student getStudentBean() {
		return new Student();
	}
	
	@Bean
	public Address getAddressBean() {
		return new Address();
	}
	
}
