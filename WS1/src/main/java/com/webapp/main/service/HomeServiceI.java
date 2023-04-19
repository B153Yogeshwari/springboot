package com.webapp.main.service;

import java.util.List;

import com.webapp.main.model.Student;

public interface HomeServiceI {

	public Student getSingledata(String user, String pass);

	public void savedata(Student s);
	public Iterable<Student> getalldata();

	

}
