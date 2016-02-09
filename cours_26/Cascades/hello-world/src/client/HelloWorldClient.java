package client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import entity.Guide;
import entity.Student;


public class HelloWorldClient {
	public static void main(String[] args) {
		
				Session session = HibernateUtil.getSessionFactory().openSession();
        		Transaction txn = session.getTransaction();
        		try {
        			txn.begin();
        			
					// persisting Student object
					/*
					Guide guide = new Guide("2000IM10901", “Ian Lamb", 2000);
					Student student = new Student("2014AL50456", “Amy Gill", guide);

					session.persist(student);
					*/	  
		
					// deleting Student object
        			/*
        			Student student = (Student) session.get(Student.class, 2L);
        			session.delete(student);
					*/  
    
	        		txn.commit();
        		}	catch(Exception e) {
	        			if(txn != null) { txn.rollback(); }
	        			e.printStackTrace();
        		}	finally {
        				if(session != null) { session.close(); }
        		}
	
	}
}



