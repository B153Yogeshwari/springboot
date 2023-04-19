package com.webapp.main.service;

import com.webapp.main.model.Student;

public interface HomeServiceI {

	public Student getSingledata(int id);
	public void savedata(Student s);
	public Iterable<Student> getalldata();
	public void deletedata(int id);
	public void deletedata1(Student s);
}
