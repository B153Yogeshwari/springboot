package com.webapp.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.webapp.main.model.Student;
import com.webapp.main.repository.HomeRepository;
import com.webapp.main.service.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI {
	@Autowired
	HomeRepository hr;

	@Override
	public Student getSingledata(String user, String pass) {
		Student s=hr.findByUserNameAndPassword(user, pass);
		return s;
	}

	@Override
	public void savedata(Student s) {
		// TODO Auto-generated method stub
		hr.save(s);
	}

	@Override
	public Iterable<Student> getalldata() {
		Iterable<Student> list=hr.findAll();
		return list;
	}
	

}
