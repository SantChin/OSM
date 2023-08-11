package com.san.osm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.san.osm.dao.UserRepository;
import com.san.osm.entity.User;
import com.san.osm.exception.EntityAlreadyFoundException;
import com.san.osm.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> getListOfUser() {
		return userRepository.findAll();
	}

	@Override
	public User addUser(User user) {
		
		boolean userCheck = checkUserExist(user);
		if(userCheck) {
			throw new EntityAlreadyFoundException(User.class, "Email Id Or Mobile Number");
		}
		return userRepository.save(user);
	}

	private boolean checkUserExist(User user) {
		boolean check = false;
		User userCheck = null;
		userCheck = userRepository.findByEmailId(user.getEmailId());
		if(userCheck == null) {
			userCheck = userRepository.findByMobileNumber(user.getMobileNumber());
			if(userCheck == null) {
				userCheck = userRepository.findByEmailIdAndMobileNumber(user.getEmailId(),user.getMobileNumber());
			}
		}
		
		if(userCheck!=null) {
			check = true;
		}
		
		return check;
	}

}
