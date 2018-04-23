package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ByConstructor;
import com.example.service.ByName;
import com.example.service.ByType;

@RestController
@RequestMapping("/v1")
public class MainController {
	
	@Autowired
	private ByType beanByType;
	
	@Autowired
	private ByName beanByName;
	
/*	@Autowired
	private ByConstructor beanByConstructor;*/
	
	@RequestMapping(method=RequestMethod.GET,value="/hello")
	public String hello() {
		return "happy coding..!";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/autoWiringByName")
	public String autoWiringByName() {
		return beanByName.getProduct().getProductName();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/autoWiringByType")
	public String autoWiringByType() {
		return beanByType.getProduct().getProductName();
	}
	
	/*@RequestMapping(method=RequestMethod.GET,value="/autoWiringByConstructor")
	public String autoWiringByConstructor() {
		return "Happy Coding..!";
	}*/
}