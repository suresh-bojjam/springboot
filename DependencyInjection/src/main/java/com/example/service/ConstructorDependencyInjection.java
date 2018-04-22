package com.example.service;

import com.example.models.Product;

public class ConstructorDependencyInjection {
	
	private Product product;
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ConstructorDependencyInjection(Product product) {
		this.product=product;
	}
	
	public void printMsg() {
		System.out.println("setter Injection: "+product.getProductName());
	}
}