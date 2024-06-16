package com.springboot.practice.service;

import org.springframework.stereotype.Service;

import com.springboot.practice.request.ProductModelRequest;

@Service
public interface Productservice {
	public ProductModelRequest save(ProductModelRequest req);
}
