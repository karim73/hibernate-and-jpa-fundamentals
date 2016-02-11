package org.perso.tuto_hibernate.cours_14.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Building a SessionFactory  using hibernate.cfg.xml

            Configuration configuration = new Configuration().
                    configure("cours_14/src/hibernate.cfg.xml");
            return configuration.buildSessionFactory(
                    new StandardServiceRegistryBuilder().
                            applySettings(
                                    configuration.getProperties()
                            ).
                            build()
            );
           
        } 
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}

