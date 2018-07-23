package com.nucleus;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
  //  BeanFactory bean=new XmlBeanFactory(new FileSystemResource("spring.xml"));
    ApplicationContext context=new  ClassPathXmlApplicationContext("spring.xml");
  Employee e=(Employee) context.getBean("emp1");
  	System.out.println(e);
    }
}
