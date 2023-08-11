package com.san.osm.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.san.osm.entity.User;

@Component
public interface UserService {

	public List<User> getListOfUser();

	public User addUser(User user);
}
