package com.webapp.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webapp.main.model.Student;
@Repository
public interface HomeRepository extends CrudRepository<Student, Integer> {
	
	public Student findByRollno(int id);

}
