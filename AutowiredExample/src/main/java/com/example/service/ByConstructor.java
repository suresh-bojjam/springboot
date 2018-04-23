package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Product;

@Service
public class ByConstructor {
	
	private Product product;

	public ByConstructor() {}

	@Autowired
	public ByConstructor(Product product) {
		this.product=product;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
