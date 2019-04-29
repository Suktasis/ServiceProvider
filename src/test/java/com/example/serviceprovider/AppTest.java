package com.example.serviceprovider;

 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.serviceprovider.domain.Client;

import junit.framework.TestCase;
 
public class AppTest extends TestCase {
 
	public void testApp() {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
 
		Client user = new Client();
		user.setLogin("heloo");
		session.save(user);
 
		session.getTransaction().commit();
		session.close();
	}
}