
package client;

import org.hibernate.Session;

import util.HibernateUtil;
import entity.Message;


public class HelloWorldClient {
	public static void main(String[] args) {
		
				Session session = HibernateUtil.getSessionFactory().openSession();
        		session.beginTransaction();
        
        		Message message = new Message( "JBOSS Logging Library with Log4j in Action, r2" );
        
        		session.save(message);    
        
        		session.getTransaction().commit();
        		session.close();
	
	}
}

