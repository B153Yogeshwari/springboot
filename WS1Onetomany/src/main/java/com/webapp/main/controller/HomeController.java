package com.webapp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.main.model.Department;
import com.webapp.main.service.HomeServiceI;

@RestController
public class HomeController {
@Autowired
HomeServiceI hsi;
@GetMapping("/getsingledata/{deptId}")
public Department getSingledata(@PathVariable("deptId") int id)
{

	return null;
	
}
}
