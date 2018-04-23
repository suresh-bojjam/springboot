package com.example.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.RequestHandledEvent;

@Component
public class CustomRequestHandledEventListener implements ApplicationListener<RequestHandledEvent>{

	@Override
	public void onApplicationEvent(RequestHandledEvent arg0) {
		System.out.println("on RequestHandledEvent");
	}
}
