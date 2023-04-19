package com.cjc.webapp.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.webapp.main.model.Enquiry;
import com.cjc.webapp.main.repository.EnquiryRepository;
import com.cjc.webapp.main.service.EnquiryServiceI;
@Service
public class EnquiryServiceImpl implements EnquiryServiceI{
	@Autowired
	EnquiryRepository er;

	@Override
	public void saveEnquiry(Enquiry e) {
		// TODO Auto-generated method stub
		er.save(e);
	}

	

}
