package com.webapp.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.main.model.Student;

@RestController
public class HomeController {
	@RequestMapping("/getdata")
	public Student getdata()
	{
		Student s=new Student();
		s.setRollno(1);
		s.setName("xyz");
		s.setUsername("xyz12");
		s.setPassword("xyz12");
		s.setAddress("pune");
		return s;
		
	}
	
	

}
