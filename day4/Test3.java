package com.nucleus.day4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test3 {

	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Customer c=new Customer();
		 c.setAddress("Agra");
		 c.setUserId(1);
		 c.setUserName("Lata");
	/*	User123 u=new User123();
		u.setUserId(100);
		u.setUserName("Aman");*/
		 session.save(c);
		 t.commit();
		 session.close();
	}

}
