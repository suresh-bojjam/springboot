package com.example.models;

import org.springframework.stereotype.Service;

public class Product2 {
	
	private String productName;
	
	private int price;
	
	public Product2() {
		
	}
	
	public Product2(String productName,int price) {
		this.productName=productName;
		this.price=price;
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
