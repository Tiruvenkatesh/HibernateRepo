package com.tiru.hibernateTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tiru.hibernateTest.model.Address;
import com.tiru.hibernateTest.model.UserModel;

public class Main 
{
	public static void main(String[] args) {
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	 Session session = sessionFactory.openSession();
	 session.beginTransaction();
	 UserModel user = new UserModel();
	 Address homeaddress = new Address();
	 homeaddress.setCity("Mumbai");
	 homeaddress.setState("Maharashtra");
	 
	 Address workaddress = new Address();	
	 workaddress.setCity("Utrecht");
	 workaddress.setState("Utrecht");
	 
	 user.setUserID(1);
	 user.setUserName("Tiru");	
	 user.setHomeaddress(workaddress);
	 user.setWorkaddress(workaddress);
	 //session.save(address);
	 session.save (user);
	 session.getTransaction().commit();
	 session.close();
	 	}

	
}
