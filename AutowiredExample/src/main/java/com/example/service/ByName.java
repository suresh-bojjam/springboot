package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Product2;

@Service
public class ByName {

	@Autowired
	private Product2 product;
	
	public ByName() {}
	
	public ByName(Product2 product) {
		this.product=product;
	}
	
	public Product2 getProduct() {
		return product;
	}

	public void setProduct(Product2 product) {
		this.product = product;
	}
}
