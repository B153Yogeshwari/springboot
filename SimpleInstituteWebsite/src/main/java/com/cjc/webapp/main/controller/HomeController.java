package com.cjc.webapp.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.webapp.main.model.Enquiry;
import com.cjc.webapp.main.service.EnquiryServiceI;



@Controller
public class HomeController {
	@Autowired
	EnquiryServiceI esi;
	
	@RequestMapping(value = "/")
	public String prelogin()
	{
		return "home";
		
	}
	@RequestMapping(value = "/enquiry")
	public String saveEnquiry(@ModelAttribute Enquiry e)
	{
		esi.saveEnquiry(e);
		return "enq";
		
	}

}
