package com.cjc.crud.webapp.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.crud.webapp.main.model.Student;
import com.cjc.crud.webapp.main.service.HomeServiceI;

@Controller
public class HomeController {
	@Autowired
	HomeServiceI hsi;
	@RequestMapping(value = "/")
	public String preLogin()
	{
		return "login";
		
	}
	@RequestMapping(value = "/openregister")
	public String login()
	{
		return "register";
		
	}
	@RequestMapping(value = "/save")
	public String register(@ModelAttribute Student s)
	{
		hsi.saveData(s);
		return "login";
		
	}
	@RequestMapping(value = "/login")
	public String loginCheck(@RequestParam String username,@RequestParam String password,Model m)
	{
		hsi.loginCheck(username, password);
		List<Student> stu=hsi.getdata();
		m.addAttribute("data", stu);
		
		return "success";		
	}
	@RequestMapping(value = "/delete")
	public String delete(@ModelAttribute Student s,Model m)
	{
		hsi.deletedata(s);
		List<Student> stu=hsi.getdata();
		m.addAttribute("data", stu);

		return "success";
		
	}
	@RequestMapping(value = "/edit")
	public String edit(@RequestParam int rollno,Model m)
	{
		Student s=hsi.editdata(rollno);
		m.addAttribute("s", s);
		return "edit";
		
	}
	@RequestMapping(value = "/update")
	public String update(@ModelAttribute Student s,Model m)
	{
		hsi.updatedata(s);
		List<Student> stu=hsi.getdata();
		m.addAttribute("data", stu);

		return "success";
		
	}
	

}
