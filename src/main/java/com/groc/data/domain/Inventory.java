package com.groc.data.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Inventory implements Serializable{
	private static final long serialVersionUID = 2049898903740L;
	
	private Long id;
	private long quantity;
	
	@Id
	@Column(name="itemName")
	@GeneratedValue (strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="quantity")
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	
	
}
