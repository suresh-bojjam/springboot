package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.models.Item;

//@Configuration
public class AppConfig {
	
	//@Bean
	public Item getItem() {
		return new Item();
	}
}