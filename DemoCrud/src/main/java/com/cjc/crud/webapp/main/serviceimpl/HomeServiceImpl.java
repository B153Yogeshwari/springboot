package com.cjc.crud.webapp.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.crud.webapp.main.model.Student;
import com.cjc.crud.webapp.main.repository.EnquiryRepository;
import com.cjc.crud.webapp.main.service.HomeServiceI;
@Service
public class HomeServiceImpl implements HomeServiceI {
	@Autowired
	EnquiryRepository hr;

	
	public void saveData(Student s) {
		hr.save(s);
		
		
	}


	@Override
	public List<Student> getdata() {
	List<Student> stu=(List<Student>) hr.findAll();
		return stu;
	}


	@Override
	public void loginCheck(String uname, String pass) {
		// TODO Auto-generated method stub
		hr.findByUserNameAndPassword(uname, pass);
		
	}


	@Override
	public void deletedata(Student s) {
		// TODO Auto-generated method stub
		hr.delete(s);
	}


	@Override
	public Student editdata(int rollno) {
		// TODO Auto-generated method stub
	    Student s=hr.findByrollno(rollno);
	    return s;
	}


	@Override
	public void updatedata(Student s) {
		// TODO Auto-generated method stub
		hr.save(s);
		
	}


	

}
