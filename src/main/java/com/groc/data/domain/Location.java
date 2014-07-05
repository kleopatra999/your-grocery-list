package com.groc.data.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Location implements Serializable {
	private static final long serialVersionUID = 624739921145L;

	private Long id;
	private String name;
	private String address;
	private Set<Checkout> checkout = new HashSet<Checkout>();

	@Id
	@Column(name = "locationId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@OneToMany(mappedBy = "location")
	public Set<Checkout> getCheckout() {
		return checkout;
	}

	public void setCheckout(Set<Checkout> checkout) {
		this.checkout = checkout;
	}

}
