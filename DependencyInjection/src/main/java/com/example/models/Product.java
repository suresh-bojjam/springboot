package com.example.models;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Product {
	
	private String productName;
	
	private int price;
	
	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public Map<String, Boolean> getBrandAvailability() {
		return brandAvailability;
	}

	public void setBrandAvailability(Map<String, Boolean> brandAvailability) {
		this.brandAvailability = brandAvailability;
	}

	public Set<String> getPlaces() {
		return places;
	}

	public void setPlaces(Set<String> places) {
		this.places = places;
	}

	private List<String> availableBrands;
	
	private Map<String,Boolean> brandAvailability;

	private Set<String> places;

	private Properties props;
	
	public Product() {
		
	}
	
	public Product(String productName,int price) {
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
	
	public List<String> getAvailableBrands() {
		return availableBrands;
	}

	public void setAvailableBrands(List<String> availableBrands) {
		this.availableBrands = availableBrands;
	}

	public void initIt(){
		System.out.println("Initializing the Bean");
	}
	
	public void cleanUp() {
		System.out.println("Cleaning Before the Destroying the Bean");	
	}
}
