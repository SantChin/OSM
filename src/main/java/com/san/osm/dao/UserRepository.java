package com.san.osm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.san.osm.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmailId(String emailId);
	
	public User findByMobileNumber(String mobile);
	
	public User findByEmailIdAndMobileNumber(String emailId,String mobileNumber);

}
