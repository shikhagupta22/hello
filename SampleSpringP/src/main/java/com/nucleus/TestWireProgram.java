package com.nucleus;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWireProgram {

	public static void main(String[] args) 
	{
		 ApplicationContext context=new  ClassPathXmlApplicationContext("spring.xml");
        Customer c=(Customer) context.getBean("cust2");
        List<Contact> cList=c.getContact();
       Iterator it=cList.iterator();
       System.out.println("Customer Name: "+c.getcName());
       while(it.hasNext())
       {
    	   Contact cn=(Contact) it.next();
    	   System.out.println(cn.getConNo()+" "+cn.getStdCode());
       }
	}

}
