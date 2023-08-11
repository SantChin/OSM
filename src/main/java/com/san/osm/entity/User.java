package com.san.osm.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.san.osm.enums.Gender;
import com.san.osm.model.AuditModel;

import lombok.NonNull;

@Entity
public class User extends AuditModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "z_user_seq", sequenceName = "z_user_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "z_user_seq")
	private long userId;
	private String firstName;
	private String lastName;
	@Column(name = "email_id", nullable = false)
	private String emailId;
	@Column(name = "mobile_number", nullable = false)
	private String mobileNumber;

	@Enumerated(EnumType.STRING)
	@Column(length = 10)
	@NonNull
	private Gender gender;

	private boolean isActive = Boolean.TRUE;
	private boolean isDeleted = Boolean.FALSE;

	@NonNull
	private String createdBy;

	@NonNull
	private String lastModifiedBy;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
	@JsonIgnoreProperties("user")
	private UserProfile userProfile;
	
	
//	  @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	    @JoinTable(
//	            name = "user_role_mapping",
//	            joinColumns = @JoinColumn(name = "user_id"),
//	            inverseJoinColumns = @JoinColumn(name = "role_id")
//	    )
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Set<Role> roles = new HashSet<>();

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long userId, String firstName, String lastName, String emailId, String mobileNumber,
			@NonNull Gender gender, boolean isActive, boolean isDeleted, @NonNull String createdBy,
			@NonNull String lastModifiedBy, UserProfile userProfile) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
		this.createdBy = createdBy;
		this.lastModifiedBy = lastModifiedBy;
		this.userProfile = userProfile;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
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

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", mobileNumber=" + mobileNumber + ", gender=" + gender + ", isActive=" + isActive + ", isDeleted="
				+ isDeleted + ", createdBy=" + createdBy + ", lastModifiedBy=" + lastModifiedBy + ", userProfile="
				+ userProfile + "]";
	}

//	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//	@JoinTable(name="user_role_mapping",joinColumns=@JoinColumn(name="user_id",referencedColumnName="userId"),
//	inverseJoinColumns=@JoinColumn(name="role_id",referencedColumnName="roleId"))
//	private List<Role> roles;

}
