package com.demo.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.main.model.User;

@Controller
public class HomeController {
	@RequestMapping(value = "/")
	public String prelogin()
	{
		return "login";
		
	}
	@RequestMapping(value = "/login")
	public String login()
	{
		return "register";
		
	}
	
	@RequestMapping(value = "/save")
	public String register( @ModelAttribute User u)
	{
		System.out.println(u.getName());
		return "success";
		
	}
	

}
