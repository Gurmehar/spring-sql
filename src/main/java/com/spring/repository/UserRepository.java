package com.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
