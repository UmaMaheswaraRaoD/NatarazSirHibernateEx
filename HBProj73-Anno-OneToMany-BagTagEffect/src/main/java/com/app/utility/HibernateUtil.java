package com.app.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory = null;
	static {
		factory = new Configuration().configure("com/app/cfgs/hibernate.cfg.xml").buildSessionFactory();
	}

	// get session object method
	public static Session getSession() {
		Session session = null;
		if (factory != null)
			session = factory.openSession();
		return session;
	}

	// close session object
	public static void closeSession(Session session) {
		if (session != null) {
			session.close();
		}
	}

	// close session factory object
	public static void closeSessionFactory() {
		if (factory != null) {
			factory.close();
		}
	}
}
