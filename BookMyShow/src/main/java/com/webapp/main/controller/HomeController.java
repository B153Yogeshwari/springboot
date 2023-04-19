package com.webapp.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.webapp.main.model.Shows;

@RestController
public class HomeController {
	@Autowired
	RestTemplate rt;
	@RequestMapping("/getcon")
	public Shows getdata()
	{
		String url="http://localhost:9095/getdata";
		Shows s=rt.getForObject(url, Shows.class);
		return s;
		
	}
	@PostMapping("/savedata")
    public String savedata(@RequestBody Shows s)
    {
    	String url="http://localhost:9095/regdata";
    	String msg=rt.postForObject(url, s, String.class);
    	System.out.println(s.getName());
		return msg;
    }
	@RequestMapping("/getlist")
	public List<List<Shows>> fetchdata()
	{
		List<List<Shows>> sh=new ArrayList<>();
		String url="http://localhost:9095/fetchdata";
		List<Shows>s1=(List<Shows>) rt.getForObject(url, Shows.class);
		String url1="http://localhost:9091/getdata";
		List<Shows>s2=(List<Shows>) rt.getForObject(url1, Shows.class);
		String url2="http://localhost:8085/getdata";
		List<Shows>s3=(List<Shows>) rt.getForObject(url2, Shows.class);
	sh.add(s1);
	sh.add(s2);
		sh.add(s3);
		
		
		return sh;
		
	}
}
