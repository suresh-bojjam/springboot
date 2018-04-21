package com.example.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurationSupport{
	
	@Bean
	public MappingJackson2HttpMessageConverter mappingJacksin2HttpMessageConverter() {
		MappingJackson2HttpMessageConverter jsonConverter=new MappingJackson2HttpMessageConverter();
		ObjectMapper MAPPER=new ObjectMapper();
		jsonConverter.setObjectMapper(MAPPER);
		return jsonConverter;
	}
	
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converter ) {
		converter.add(mappingJacksin2HttpMessageConverter());
		super.addDefaultHttpMessageConverters(converter);
	}
}
