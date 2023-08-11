package com.san.osm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.san.osm.entity.User;
import com.san.osm.entity.UserProfile;
import com.san.osm.enums.Gender;
import com.san.osm.service.UserService;

public class UserServiceTest extends OsmbackendApplicationTests{

	@Autowired
	UserService userService;
	
	
	@Test
	public void addUser() {
		
		User user = new User();
			user.setFirstName("Vijay");
			user.setLastName("Ch");
			user.setEmailId("viju.r@gmail.com");
			user.setMobileNumber("7854123698");
			user.setLastModifiedBy("ADMIN");
			user.setCreatedBy("ADMIN");
			user.setGender(Gender.MALE);
			
		UserProfile userProfile = new UserProfile();
		userProfile.setAddr1("H.No C3-94,Chanda Nagar,Hyderabad");	
		userProfile.setLastModifiedBy("ADMIN");
		userProfile.setCreatedBy("ADMIN");
		userProfile.setUser(user);
		
		user.setUserProfile(userProfile);
		
		User newUser = userService.addUser(user);
		
		System.out.println(newUser);
	}
}
