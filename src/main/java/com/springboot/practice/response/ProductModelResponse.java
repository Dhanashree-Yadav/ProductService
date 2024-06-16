package com.springboot.practice.response;

public class ProductModelResponse {

	String name;
	Object description;
	double price;

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

}
