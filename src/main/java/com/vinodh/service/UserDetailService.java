package com.vinodh.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinodh.user.model.User;
import com.vinodh.user.repository.UserRepository;

@Service
public class UserDetailService {

	@Autowired
	private UserRepository userRepository;

	public User insertUserInfo(User user) {
		user.setCreateDate(new Date());
		return userRepository.save(user);
	}

	public User updateUser(User user) {
		return userRepository.save(user);
	}

	public Optional<User> findByUserId(long id) {
		return userRepository.findById(id);
	}

	public String deleteUser(long id) {
		userRepository.deleteById(id);
		 return "User has been deleted successfully";
	}

}
