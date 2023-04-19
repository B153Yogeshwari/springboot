package com.webapp.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webapp.main.model.Department;
@Repository
public interface HomeRepository extends CrudRepository<Department, Integer> {

}
