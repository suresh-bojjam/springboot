package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.config.AppConfig;
import com.example.models.Item;
import com.example.models.Product;
import com.example.service.ConstructorDependencyInjection;
import com.example.service.SetterDependencyInjection;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DependencyInjectionApplicationTests {

	ApplicationContext context=null;

	@Before
	public void init() {
		context=new ClassPathXmlApplicationContext("app-config.xml");
	}

	@After
	public void tearDown() {
		System.out.println("after method");
	}

	@Test
	public void contextLoads() {

	}

	@Test
	public void testApplicationContext() {

		Product product=(Product)context.getBean("productBean");
		System.out.println("inside test case");
		assertNotNull(product);
		assertEquals(product.getProductName(),"productABC");
		product.getBrandAvailability().forEach((key,val)->{
			System.out.print(key+"::"+val);
		});

		product.getAvailableBrands().forEach((val)->{
			System.out.print(val);
		});
		System.out.println("after test case");
	}

	@Test
	public void testBeanFactoryContext() {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("app-config.xml"));
		Product product=(Product)factory.getBean("productBean");
		System.out.println("inside test case");
		assertNotNull(product);
		assertEquals(product.getProductName(),"productABC");
		System.out.println("after test case");
	}


	@Test
	public void testAnnotationBasedContext() {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Item item=ctx.getBean(Item.class);
		assertNotNull(item);
		System.out.println("annotation Based Bean Creation");
	}

	@Test
	public void testConstructorDependency() {
		ConstructorDependencyInjection constructorDI=(ConstructorDependencyInjection)context.getBean("constructorDependency");
		assertNotNull(constructorDI);
		assertEquals(constructorDI.getProduct().getProductName(),"productABC");
		System.out.println("after test case");}

	@Test
	public void testSetterDependency() {
		SetterDependencyInjection setterDI=(SetterDependencyInjection)context.getBean("setterDependency");
		assertNotNull(setterDI);
		assertEquals(setterDI.getProduct().getProductName(),"productABC");
		System.out.println("after test case");
	}
}