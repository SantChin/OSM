package com.san.osm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.san.osm.dao.RoleRepository;
import com.san.osm.entity.Role;
import com.san.osm.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleRepository roleRepository;
	
	@Override
	public Role addNewRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public List<Role> getRolesList() {
		return roleRepository.findAll();
	}

}
