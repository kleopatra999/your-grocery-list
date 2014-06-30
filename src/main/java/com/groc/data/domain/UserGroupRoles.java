package com.groc.data.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class UserGroupRoles implements Serializable{
	private static final long serialVersionUID = 12398073457934L;
	private Long id;
	
	
	@Id
	@Column(name="userGroupRoleId")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}
