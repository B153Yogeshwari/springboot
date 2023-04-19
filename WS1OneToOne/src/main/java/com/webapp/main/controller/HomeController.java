package com.webapp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.main.model.Student;
import com.webapp.main.service.HomeServiceI;

@RestController
public class HomeController {
	@Autowired
	HomeServiceI hsi;
	@GetMapping("/getsingledata/{rollno}")
	public Student singledata(@PathVariable("rollno") int id)
	{
		Student s=hsi.getSingledata(id);
		return s;
		
	}
	@PostMapping("/savedata")
	public String savedata(@RequestBody Student s)
	{
		
		hsi.savedata(s);
		return "Successfully save";
		
	}
	@GetMapping("/getall")
	public Iterable<Student> getalldata()
	{
		Iterable<Student> list=hsi.getalldata();
		return list;
		
	}
	@PutMapping("updatedata/{rollno}")
	public String updatedata(@PathVariable("rollno") int id,@RequestBody Student s)
	{
		hsi.savedata(s);
		return "update Successfully";
		
	}
	@DeleteMapping("/deletedata/{rollno}")
	public String deletedata(@PathVariable("rollno") int id)
	{
		hsi.deletedata(id);
		return "successfully delete";
		
	}@DeleteMapping("/removedata")
	public String removedata(@RequestBody Student s)
	{
		hsi.deletedata1(s);
		return "successfully delete";
		
	}

}
