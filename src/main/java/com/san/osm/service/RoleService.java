package com.san.osm.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.san.osm.entity.Role;

@Component
public interface RoleService {

	public Role addNewRole(Role role);

	public List<Role> getRolesList();
}
