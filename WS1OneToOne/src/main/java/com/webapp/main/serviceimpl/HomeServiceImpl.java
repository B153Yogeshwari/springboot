package com.webapp.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.main.model.Student;
import com.webapp.main.repository.HomeRepository;
import com.webapp.main.service.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI {
@Autowired
HomeRepository hr;

@Override
public Student getSingledata(int id) {
	Student s=hr.findByRollno(id);
	return s;
}

@Override
public void savedata(Student s) {
	hr.save(s);
	
	
}

@Override
public Iterable<Student> getalldata() {
	Iterable<Student> list=hr.findAll();
	return list;
}

@Override
public void deletedata(int id) {
	hr.deleteById(id);

	
}

@Override
public void deletedata1(Student s) {
	// TODO Auto-generated method stub
	hr.delete(s);
	
	
}
}
