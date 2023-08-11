package com.san.osm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.san.osm.entity.Role;
import com.san.osm.service.RoleService;

@RestController
@RequestMapping("/api/v1/role")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(name="/list",method=RequestMethod.GET)
	public List<Role> getRolesList(){
		return roleService.getRolesList();
		
	}
	
	@RequestMapping(name="/add",method=RequestMethod.POST)
	public Role addNewRole(@RequestBody Role role,@RequestHeader(value = "authUser") int authUser){
		//return roleService.addNewRole(role,authUser);
		return null;
	}
}
