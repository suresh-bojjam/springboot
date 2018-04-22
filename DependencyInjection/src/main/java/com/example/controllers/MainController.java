package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Product;

@RestController
@RequestMapping("/v1")
public class MainController {
	
	@Autowired
	private Product product;
	
	@RequestMapping(method=RequestMethod.GET,value="/hello")
	public String hello() {
		return "happy coding..!";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/product")
	public String getProduct() {
		return product.getProductName();
	}
}