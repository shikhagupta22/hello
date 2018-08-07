package com.nucleus.day4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Vendor2 v=new Vendor2();
		v.setvId(1);
		v.setvName("Amar");
		Address2 ad=new Address2();
		ad.setaId(100);
		ad.setCity("LKO");
		ad.setState("UP");
		Address2 ad1=new Address2();
		ad1.setaId(101);
		ad1.setCity("knp");
		ad1.setState("UP");
		v.getAdrs().add(ad);
		v.getAdrs().add(ad1);
		ad.setVendor(v);
		ad1.setVendor(v);
		session.save(v);
		t.commit();
		session.close();

	}

}
