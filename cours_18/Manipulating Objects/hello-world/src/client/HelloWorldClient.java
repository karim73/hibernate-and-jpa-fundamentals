package client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import entity.Message;


public class HelloWorldClient {
	public static void main(String[] args) {
		
				Session session = HibernateUtil.getSessionFactory().openSession();
        		Transaction txn = session.getTransaction();
        		try {
        			txn.begin();
        	
        			//Finding objects
        			/*
        			Message msg = (Message) session.get(Message.class, 2L);
        			*/
        			
        			//Updating objects
        			/*
        			Message msg = (Message) session.get(Message.class, 2L);
        			msg.setText( “Hello Automatic Dirty Checking” );
        			*/
        			
        			//Deleting objects
        			/*
        			Message msg = (Message) session.get(Message.class, 2L);  
        			session.delete(msg);
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




