package com.san.osm.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.san.osm.model.AuditModel;

import lombok.NonNull;

@Entity
public class UserProfile extends AuditModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "z_userprofile_seq", sequenceName = "z_userprofile_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "z_userprofile_seq")
	private Long userProfileId;

	@Column(name = "addr_1", nullable = false)
	private String addr1;

	@Column(name = "addr_2")
	private String addr2;

	private boolean isActive = Boolean.TRUE;
	private boolean isDeleted = Boolean.FALSE;

	@NonNull
	private String createdBy;

	@NonNull
	private String lastModifiedBy;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	@JsonIgnoreProperties("userProfile")
	private User user;
	
	
	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public UserProfile(Long userProfileId, String addr1, String addr2, boolean isActive, boolean isDeleted,
			@NonNull String createdBy, @NonNull String lastModifiedBy, User user) {
		super();
		this.userProfileId = userProfileId;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
		this.createdBy = createdBy;
		this.lastModifiedBy = lastModifiedBy;
		this.user = user;
	}

	

	public Long getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(Long userProfileId) {
		this.userProfileId = userProfileId;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "UserProfile [userProfileId=" + userProfileId + ", addr1=" + addr1 + ", addr2=" + addr2 + ", isActive="
				+ isActive + ", isDeleted=" + isDeleted + ", createdBy=" + createdBy + ", lastModifiedBy="
				+ lastModifiedBy + "]";
	}



	
	
}
