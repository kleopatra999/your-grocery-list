package com.groc.data.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Checkout implements Serializable {
	public static final long serialVersionUID = 862342093742L;
	private Long id;
	private Date checkOutDate;
	private double subTotal;
	private double tax;
	private Set<Items> items = new HashSet<Items>();
	private Location location;
	private GrocUser user;

	@Id
	@Column(name = "checkoutId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "checkoutDate")
	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	@Column(name = "subTotal")
	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	@Column(name = "tax")
	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@ManyToMany
	@JoinTable(name = "CHECKOUT_ACTION", joinColumns = @JoinColumn(name = "checkoutId"), inverseJoinColumns = @JoinColumn(name = "itemId"))
	public Set<Items> getItems() {
		return items;
	}

	public void setItems(Set<Items> items) {
		this.items = items;
	}

	@ManyToOne
	@JoinColumn(name = "locationId")
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@ManyToOne
	@JoinColumn(name = "userId")
	public GrocUser getUser() {
		return user;
	}

	public void setUser(GrocUser user) {
		this.user = user;
	}

}
