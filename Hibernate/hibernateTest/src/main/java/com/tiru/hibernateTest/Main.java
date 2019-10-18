package com.tiru.hibernateTest;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tiru.hibernateTest.model.Address;
import com.tiru.hibernateTest.model.Address2;
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
	 
	 Address2 homeaddress2 = new Address2();
	 homeaddress2.setCity("Mumbai");
	 homeaddress2.setState("Maharashtra");
	 
	 Address2 workaddress2 = new Address2();	
	 workaddress2.setCity("Utrecht");
	 workaddress2.setState("Utrecht");
	 
	 Set<Address2> ListOfAddrress = new HashSet<Address2>();
	 ListOfAddrress.add(workaddress2);
	 ListOfAddrress.add(homeaddress2);
	 
	 
	 user.setUserID(1);
	 user.setUserName("Tiru");	
	 user.setHomeaddress(homeaddress);
	 user.setWorkaddress(workaddress);
	 user.setAddressList(ListOfAddrress);
	 //session.save(address);
	 session.save (user);
	 session.getTransaction().commit();
	 session.close();
	 	}

	
}
