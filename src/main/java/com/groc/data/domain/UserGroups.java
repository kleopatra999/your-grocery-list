package com.groc.data.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER_GROUPS")
public class UserGroups implements Serializable {
	private static final long serialVersionUID = -12981029810283L;
	private Long id;
	private String userGroupName;
	private GrocUser user;

	@Id
	@Column(name = "userGroupId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "userGroupName")
	public String getUserGroupName() {
		return userGroupName;
	}

	public void setUserGroupName(String userGroupName) {
		this.userGroupName = userGroupName;
	}

	@OneToMany(mappedBy = "userGroups")
	public GrocUser getUser() {
		return user;
	}

	public void setUser(GrocUser user) {
		this.user = user;
	}
}
