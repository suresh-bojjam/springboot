package com.example.controllers;

import javax.validation.Valid;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Hello;
import com.example.models.Product;

@RestController
@RequestMapping("/v1")
public class MainController {
	
	@RequestMapping(method=RequestMethod.POST,value="/hello")
	public Hello route(@RequestBody Hello hello) {
		Hello message=new Hello();
		if(!StringUtils.isEmpty(hello.getMessage()))
			message.setMessage(hello.getMessage());
		return message;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addproduct")
	public Product addProduct(@RequestBody Product product) {
		return product;
	}
}
