package com.cjc.crud.webapp.main.service;

import java.util.List;

import com.cjc.crud.webapp.main.model.Student;

public interface HomeServiceI {
	public void saveData(Student s);
	public List<Student> getdata();
	public void loginCheck(String uname,String pass);
	public void deletedata(Student s);
	public Student editdata(int rollno);
	public void updatedata(Student s);

}
