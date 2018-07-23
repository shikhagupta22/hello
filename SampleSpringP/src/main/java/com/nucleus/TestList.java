package com.nucleus;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestList {

	public static void main(String[] args) 
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Vendor e=(Vendor) context.getBean("e");
	List<Address> ad=e.getAdrs();
	Iterator it=ad.iterator();
	while(it.hasNext())
	{
		Address a=(Address) it.next();
		System.out.println(a.getCity()+" "+a.getState());
	}
	System.out.println(e.getProp());
	}

}
