package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Guide;

public class UserYClient {	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
		EntityManager em1 = emf.createEntityManager();
		em1.getTransaction().begin();		
		
		Guide guide = em1.find(Guide.class, 3L);				
	
		em1.getTransaction().commit();
		em1.close();	

		guide.setSalary(4000);
		
		EntityManager em2 = emf.createEntityManager();
		em2.getTransaction().begin();
		
		Guide mergedGuide = em2.merge(guide);
		
		em2.getTransaction().commit();
		em2.close();	
		
	}
}
