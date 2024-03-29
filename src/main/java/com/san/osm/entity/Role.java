package com.san.osm.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.san.osm.model.AuditModel;

import lombok.NonNull;

@Entity

public class Role extends AuditModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="z_role_seq",sequenceName="z_role_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="z_role_seq")
	private long roleId;
	private String roleName;
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	private boolean isActive=Boolean.TRUE;
	private boolean isDeleted=Boolean.FALSE;

	@NonNull
	private String createdBy;
	@NonNull
	private String lastModifiedBy;
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
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

	
}
