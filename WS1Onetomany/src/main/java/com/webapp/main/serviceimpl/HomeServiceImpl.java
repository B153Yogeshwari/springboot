package com.webapp.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.main.repository.HomeRepository;
import com.webapp.main.service.HomeServiceI;
@Service
public class HomeServiceImpl implements HomeServiceI{
	@Autowired
	HomeRepository hr;

}
