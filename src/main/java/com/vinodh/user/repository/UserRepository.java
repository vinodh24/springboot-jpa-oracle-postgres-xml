package com.vinodh.user.repository;

import java.util.List;

import com.vinodh.repository.GenericDAO;
import com.vinodh.user.model.User;

public interface UserRepository extends GenericDAO<User>{
	
	List<User> findByFirstName(String firstName);
	
}
