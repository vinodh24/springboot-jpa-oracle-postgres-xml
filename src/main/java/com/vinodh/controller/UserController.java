package com.vinodh.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinodh.service.UserDetailService;
import com.vinodh.user.model.User;


@RestController
@RequestMapping("/users")
public class UserController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserDetailService userDetailService;

	@PostMapping(path= "/add", consumes = "application/json", produces = "application/json")	
	public User createOrSaveUserInfo(@RequestBody User user) {
		log.info("doing user..."+user);
		return userDetailService.insertUserInfo(user);
	}
	
	@PutMapping(path= "/updateUser", consumes = "application/json", produces = "application/json")
	public User updateUser(@RequestBody User user)
	{
		return userDetailService.updateUser(user);
	}
	
	@GetMapping(path= "/findByUserId/{id}", produces = "application/json")
	public Optional<User> findByUserId(@PathVariable long id )
	{
		return userDetailService.findByUserId(id);
	}
	
	@DeleteMapping(path= "/deleteByUserId/{id}", produces = "application/json")
	public String deleteUser(@PathVariable long id )
	{
		return userDetailService.deleteUser(id);
	}



}