package com.pjtreact.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pjtreact.service.UserService;

@RestController
public class UserController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public void selectListUser() {
		
		logger.trace("Trace Level 테스트"); 
		logger.debug("DEBUG Level 테스트"); 
		logger.info("INFO Level 테스트"); 
		logger.warn("Warn Level 테스트"); 
		logger.error("ERROR Level 테스트");

		userService.selectListUser();
		
	}
	
}
