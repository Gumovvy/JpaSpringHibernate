package com.gmv.decerto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class mainClass {

	public static void main(String[] args) {
		Vechicle vechicle = new Vechicle();
		vechicle.setVechicleName("Car");

		TwoWheeler bike = new TwoWheeler();
		bike.setVechicleName("Bike");
		bike.setSteeringHandle("Handle");

		FourWheeler car = new FourWheeler();
		car.setSteeringWheel("Wheel");
		car.setVechicleName("Porsche");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(vechicle);
		session.save(bike);
		session.save(car);

		session.getTransaction().commit();
		session.close();

	}
}
