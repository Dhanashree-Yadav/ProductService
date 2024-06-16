package com.springboot.practice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= "products")
public class ProductModel {

	public String id;
	
}
