package com.gmv.decerto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class mainClass {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserName("First user");

		Vechicle vechicle = new Vechicle();
		Vechicle vechicle2 = new Vechicle();
		vechicle.setVechicleName("Car");

		vechicle2.setVechicleName("Jeep");

		user.getVechicle().add(vechicle);
		user.getVechicle().add(vechicle2);
		vechicle.setUser(user);
		vechicle2.setUser(user);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(user);
		session.save(vechicle);
		session.save(vechicle2);

		session.getTransaction().commit();
		session.close();

	}

}
