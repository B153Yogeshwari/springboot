package com.cjc.webapp.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.webapp.main.model.Enquiry;

@Repository
public interface EnquiryRepository extends CrudRepository<Enquiry, Long> {

}
