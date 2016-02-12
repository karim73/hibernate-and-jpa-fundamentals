package org.perso.tuto_hibernate.cours_14.main;

import org.hibernate.Session;

import org.perso.tuto_hibernate.cours_14.util.HibernateUtil;
import org.perso.tuto_hibernate.cours_14.entity.Message;
// import org.perso.tuto_hibernate.cours_14.domain.Message;

public class Main {
	public static void main(String[] args) {
		
				Session session = HibernateUtil.getSessionFactory().openSession();
        		session.beginTransaction();
        
        		Message message = new Message( "Hello World with Hibernate & JPA Annotations" );
        
        		session.save(message);    
        
        		session.getTransaction().commit();
        		session.close();
	
	}
}

