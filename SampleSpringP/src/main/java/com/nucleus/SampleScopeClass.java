package com.nucleus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleScopeClass {

	public static void main(String[] args)
	{
		 ApplicationContext context=new  ClassPathXmlApplicationContext("spring.xml");
        Sample b1=(Sample) context.getBean("bean1");
        Sample b2=(Sample) context.getBean("bean1");
        if(b1==b2)
        {
        	System.out.println("same object called...");
        }
        else
        {
        	System.out.println("new object created.");
        }
	}

}
