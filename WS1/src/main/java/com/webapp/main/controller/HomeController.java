package com.webapp.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.main.model.Student;
import com.webapp.main.service.HomeServiceI;

@RestController
public class HomeController {
	@Autowired
	HomeServiceI hsi;
	@GetMapping("/singledata/{userName}/{password}")
	public Student singledata(@PathVariable("userName") String user,@PathVariable("password") String pass)
	{
		Student s=hsi.getSingledata(user,pass);
		return s;
	
		
	}
	@PostMapping("/regdata")
	public String savadata(@RequestBody Student s)
	{
		hsi.savedata(s);
		return "Successfully save";
		
	}
	
	@GetMapping("/login/{un}/{ps}")
	public Student login(@PathVariable("un") String uname,@PathVariable("ps") String pass)
	{
		if(uname.equals("ADMIN")&& pass.equals("ADMIN"))
		{
			Student s=new Student();
			s.setRollno(1);
			s.setName("xyz");
			s.setAddress("pune");
			return s;
		}
		else {
			
		
			System.out.println("username and password not correct");
		return null;}
		
	}
	@GetMapping("/getalldata")
	public Iterable<Student> getAlldata()
	{
		Iterable<Student> stu=hsi.getalldata();
		
		return stu;
		
	}
	@PutMapping("updatedata/{rollno}")
	public String updateData(@PathVariable("rollno") int id,@RequestBody Student s)
	{
		System.out.println("Uid is==="+id);
		System.out.println("body id is==="+s.getRollno());
		
		hsi.savedata(s);
		
		return "successfully updated";
		
	}

	
}
