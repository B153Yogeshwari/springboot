package com.webapp.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	 @RequestMapping("/log")
	public String prelogin()
	{
		return "login";
		
	}

}
