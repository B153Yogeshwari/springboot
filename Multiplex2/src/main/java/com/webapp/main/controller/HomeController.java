package com.webapp.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.main.model.Shows;

@RestController
public class HomeController {

	@RequestMapping("/getdata")
	public List<Shows> getdata()
	{
		List<Shows> sh=new ArrayList<>();
		Shows s=new Shows();
		s.setShowId(1);
		s.setName("xyz");
		s.setDate("18/04/2023");
		s.setTime("7pm");
		s.setPrice(200);
		s.setAvailableTicket(24);
		s.setType("action");
		Shows s1=new Shows();
		s1.setShowId(2);
		s1.setName("pqr");
		s1.setDate("18/04/2023");
		s1.setTime("9pm");
		s1.setPrice(200);
		s1.setAvailableTicket(24);
		s1.setType("action");
		sh.add(s1);
		sh.add(s);
		
		return sh;
		
	}
}
