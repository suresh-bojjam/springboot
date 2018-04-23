package com.example.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher {
	
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void publishEvent(final String message) {
		CustomEvent customEvent=new CustomEvent(this,message);
		System.out.println(applicationEventPublisher.toString());
		applicationEventPublisher.publishEvent(customEvent);
	}
}