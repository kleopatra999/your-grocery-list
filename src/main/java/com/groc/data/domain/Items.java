package com.groc.data.domain;

import java.io.Serializable;
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

public class Items implements Serializable {
	private static final long serialVersionUID = 110342454587829L;

	private Long id;
	private String ItemName;
	private String brandName;
	private String description;
	private double itemPrice;
	private double itemCost;
	private boolean taxable;
	private byte[] image;
	private Set<Checkout> checkout = new HashSet<Checkout>();
	private Category category;
	private Inventory inventory;

	@Id
	@Column(name = "itemId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "itemName")
	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	@Column(name = "brandName")
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Column(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "itemPrice")
	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Column(name = "itemCost")
	public double getItemCost() {
		return itemCost;
	}

	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}

	@Column(name = "taxable")
	public boolean isTaxable() {
		return taxable;
	}

	public void setTaxable(boolean taxable) {
		this.taxable = taxable;
	}

	@Column(name = "image")
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@ManyToMany
	@JoinTable(name = "CHECKOUT_ACTION", joinColumns = @JoinColumn(name = "itemId"), inverseJoinColumns = @JoinColumn(name = "checkoutId"))
	public Set<Checkout> getCheckout() {
		return checkout;
	}

	public void setCheckout(Set<Checkout> checkout) {
		this.checkout = checkout;
	}

	@ManyToOne
	@JoinColumn(name = "categoryId")
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@ManyToOne
	@JoinColumn(name = "inventoryId")
	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

}
