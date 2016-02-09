
package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Guide;
import entity.Student;

public class HelloWorldClient {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
        		try {
        			txn.begin();

					//Lazy Collection Fetching with default settings(fetch=FetchType.LAZY for collection associations)
        			Guide guide = em.find(Guide.class, 2L);
        			Set<Student> students = guide.getStudents();
            		int numberOfStudents = students.size();  

					//Eager Fetching with default settings (fetch=FetchType.EAGER for single point associations)
					//Student student = em.find(Student.class, 2L);
  
	        		txn.commit();
        		}	catch(Exception e) {
	        			if(txn != null) { txn.rollback(); }
	        			e.printStackTrace();
        		}	finally {
        				if(em != null) { em.close(); }
        		}
        
	}
}






