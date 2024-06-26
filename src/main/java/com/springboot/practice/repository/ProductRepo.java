package com.springboot.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.practice.model.ProductModel;

@Repository
public interface ProductRepo extends JpaRepository<ProductModel, String>{

	
}
