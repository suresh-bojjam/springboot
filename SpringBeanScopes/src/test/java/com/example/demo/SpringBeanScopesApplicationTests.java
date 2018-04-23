package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.models.Product;
import com.example.models.Product2;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBeanScopesApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testSingleton() {
		ApplicationContext context=new ClassPathXmlApplicationContext("app-config.xml");
		
		Set<Object> singletonList=new HashSet<>();
		Set<Object> prototypeList=new HashSet<>();
		
		for(int i=1;i<=5;i++) {
			singletonList.add(context.getBean("product", Product.class));		
			prototypeList.add(context.getBean("product2", Product2.class));
		}
		
		System.out.println("noOfProducts: "+singletonList.size());
		System.out.println("noOfProducts(2): "+prototypeList.size());
	}
}
