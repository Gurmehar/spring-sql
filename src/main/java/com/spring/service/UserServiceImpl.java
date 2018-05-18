package com.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.User;
import com.spring.repository.UserRepository;
import com.spring.service.exception.UserNotFoundException;
import com.spring.utility.BasicUtils;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User findOneById(int id) throws UserNotFoundException {
		Optional<User> user=  userRepository.findById(id);
		if(BasicUtils.isNull(user)){
			throw new  UserNotFoundException();
		}
		 return user.get();
		
	}

	@Override
	public void delete(int id) {
		userRepository.deleteById(id);

	}

	@Override
	public int saveUser(User user) {
		 user=userRepository.save(user);
		return user.getId();
	}

}
