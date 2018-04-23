package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Product3;

@Service
public class ByType {

	private Product3 product;

	public ByType(){}

	public ByType(Product3 product) {
		this.product=product;
	}

	public Product3 getProduct() {
		return product;
	}
	//Autowired annotation on variable/setters is equivalent to autowire="byType"
	@Autowired
	public void setProduct(Product3 product) {
		this.product = product;
	}
}