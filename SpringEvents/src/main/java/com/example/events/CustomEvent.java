package com.example.events;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent{

	private String message;

	public CustomEvent(Object source) {
		super(source);
	}

	public CustomEvent(Object source, String message) {
		super(source);
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "Custom Event";
	}
	
}
