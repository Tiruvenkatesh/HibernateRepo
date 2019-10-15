package com.tiru.hibernateTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tiru.hibernateTest.model.UserModel;

public class Main 
{

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	 Session session = sessionFactory.openSession();
	 session.beginTransaction();
	 UserModel user = new UserModel();
	 user.setUserID(1);
	 user.setUserName("Tiru");
	 session.save(user);
	 session.commit();	
	
}
