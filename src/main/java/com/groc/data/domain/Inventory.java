package com.groc.data.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "INVENTORY")
@SequenceGenerator(name = "groc_id_seq", sequenceName = "GROC_ID_SEQ")
public class Inventory implements Serializable {
	private static final long serialVersionUID = 2049898903740L;

	private Long id;
	private long quantity;
	private Set<Items> item = new HashSet<Items>();

	@Id
	@Column(name = "itemName")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "groc_id_seq")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "quantity")
	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	@OneToMany(mappedBy = "inventory", cascade = CascadeType.ALL, orphanRemoval = true)
	public Set<Items> getItem() {
		return item;
	}

	public void setItem(Set<Items> item) {
		this.item = item;
	}

}
