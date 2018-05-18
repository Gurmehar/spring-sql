package com.spring.service;

import com.spring.domain.User;
import com.spring.service.exception.UserNotFoundException;

public interface UserService {
	
	 User findOneById(int Id) throws UserNotFoundException;
	 void  delete(int Id);
	 
	 int saveUser(User user);
	 

}
