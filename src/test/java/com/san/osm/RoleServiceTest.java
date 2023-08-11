package com.san.osm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.san.osm.entity.Role;
import com.san.osm.service.RoleService;

public class RoleServiceTest extends OsmbackendApplicationTests {

	@Autowired
	RoleService roleService;
	
	@Test
	public void addRole() {
		//Role role = new Role(1,"ADMIN", true, false, "ADMIN", "ADMIN");
		Role role = new Role();
				role.setRoleName("USER");
				role.setCreatedBy("ADMIN");
				role.setLastModifiedBy("ADMIN");
		Role addNewRole = roleService.addNewRole(role);
		if(addNewRole!=null) {
			System.out.println("Role Added");
		}
	}
	
	
}
