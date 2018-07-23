package com.nucleus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConf {

	public static void main(String[] args) 
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(SetBeanConf.class);
	  Sample sample=(Sample) context.getBean("bean1");
	 sample.setMessage("ghfgf");
	 System.out.println(sample.getMessage());
	
	}

}
