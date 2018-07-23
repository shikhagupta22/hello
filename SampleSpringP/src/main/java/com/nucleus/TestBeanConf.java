package com.nucleus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanConf {

	public static void main(String[] args) 
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigureBean.class);
		Employee e=(Employee) context.getBean("bean");
		e.setEmpId(1);
		System.out.println(e);
	}

}
