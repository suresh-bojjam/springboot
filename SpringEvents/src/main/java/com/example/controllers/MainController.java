package com.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.events.CustomEventPublisher;

@RestController
@RequestMapping(value="/v1")
public class MainController {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello() {
		return "Happy Coding..!";
	}
	
	@RequestMapping(value="/event",method=RequestMethod.GET)
	public void event() {
		System.out.println("publishing the custom event");
		new CustomEventPublisher().publishEvent("custom event");
	}
}