package com.xworkz.thor.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.thor.dto.SportsDTO;

public class SportsDAO {

	public boolean saveDetails(SportsDTO dto) {
		boolean flag = true;
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		try {
			session.save(dto);
			transaction.commit();
		} catch (Exception e) {
			System.err.println("exception occur : " + e.getMessage());
			transaction.rollback();
			flag = false;
		}
		session.close();
		factory.close();
		return flag;
	}
}
