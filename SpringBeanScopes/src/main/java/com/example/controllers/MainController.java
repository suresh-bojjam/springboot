package com.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MainController {
	
	@RequestMapping(method=RequestMethod.GET,value="/hello")
	public String hello() {
		return "happy coding..!";
	}
}