package com.nucleus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) 
	{
	    ApplicationContext context=new  ClassPathXmlApplicationContext("spring.xml");
	    Vendor v=(Vendor) context.getBean("bean1");
	    System.out.println(v);
	}
}
