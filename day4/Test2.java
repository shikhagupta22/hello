package com.nucleus.day4;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test2 {

	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Vendor2 v=(Vendor2) session.get(com.nucleus.day4.Vendor2.class,1);
	
		 List<Address2> adrs=v.getAdrs();
		 for(Address2 ad:adrs)
		 {
			 System.out.println(ad.getCity()+" "+ad.getState());
		 }
		t.commit();
		session.close();
	}

}
