package com.cjc.crud.webapp.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.crud.webapp.main.model.Student;

@Repository
public interface EnquiryRepository extends CrudRepository<Student,Integer>{

	public void findByUserNameAndPassword(String uname,String pass);
	public Student findByrollno(int rollno);
}
