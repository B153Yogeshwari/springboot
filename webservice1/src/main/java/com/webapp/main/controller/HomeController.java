package com.webapp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.webapp.main.model.Student;
@CrossOrigin("*")
@RestController
public class HomeController {
	@Autowired
	RestTemplate rt;
	@RequestMapping("/getdata")
	public Student getdata()
	{
		String url="http://localhost:9095/getdata";
		Student s=rt.getForObject(url, Student.class);
		return s;
		
	}

}
