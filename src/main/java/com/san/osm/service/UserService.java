package com.san.osm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.san.osm.dao.UserRepository;
import com.san.osm.entity.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public User addUser(User user) {
		return userRepo.save(user);
	}

}
