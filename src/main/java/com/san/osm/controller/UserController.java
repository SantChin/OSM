package com.san.osm.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.san.osm.entity.User;
import com.san.osm.service.UserService;


@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/list", method = { RequestMethod.OPTIONS, RequestMethod.GET })
	public List<User> getUsers(){
		return userService.getListOfUser();
	}
	
	@RequestMapping(value = "/add", method = { RequestMethod.OPTIONS, RequestMethod.POST })
	public User addUser(@RequestBody User user){
		return userService.addUser(user);
	}

	
}
