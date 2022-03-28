package com.san.osm.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.san.osm.model.AuditModel;

import lombok.Data;

@Entity
@Data
public class Role extends AuditModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long roleId;
	private String roleName;

	private boolean isActive;
	private boolean isDeleted;

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

	public Role(long roleId, String roleName, boolean isActive, boolean isDeleted) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
	}

	
}
