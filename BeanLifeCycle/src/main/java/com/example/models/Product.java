package com.example.models;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Product implements ApplicationContextAware,
BeanNameAware,
BeanFactoryAware,
InitializingBean, 
DisposableBean {

	private int price;
	
	private String productName;
	
	public Product() {
		System.out.println("inside constructor");
	}
	
	public Product(String prouctName, int price) {
		System.out.println("inside constructor");
		this.productName=productName;
		this.price=price;
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("inside destroy");
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside afterPropertiesSet");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("setting the Bean Name");
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println(arg0);
		System.out.println("setting the Bean Name");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("setting the Application Context");
	}
}
