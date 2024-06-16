package com.springboot.practice.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class ProductModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	public String name;
	public Object description;
	public double price;
	public Date addedon;
	public Date modifiedon;

	public ProductModel() {
	}

	public ProductModel(long id, String name, Object description, double price, Date addedon, Date modifiedon) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.addedon = addedon;
		this.modifiedon = modifiedon;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getDescription() {
		return description;
	}

	public void setDescription(Object description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getAddedon() {
		return addedon;
	}

	public void setAddedon(Date addedon) {
		this.addedon = addedon;
	}

	public Date getModifiedon() {
		return modifiedon;
	}

	public void setModifiedon(Date modifiedon) {
		this.modifiedon = modifiedon;
	}

}
