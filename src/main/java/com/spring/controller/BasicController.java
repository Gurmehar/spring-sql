package com.spring.controller;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.domain.User;
import com.spring.service.UserService;
import com.spring.service.exception.UserNotFoundException;

@RestController
public class BasicController {
	
	private static Logger log = Logger.getLogger(BasicController.class);
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value="/getdetail",path="id")
	public User getUser(Integer id) throws UserNotFoundException{
		return userService.findOneById(id);
	}
	
	@PutMapping(value="/save")
	public void addUser(@RequestBody User user){
		userService.saveUser(user);
	}

}
