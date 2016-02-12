package org.perso.tuto_hibernate.cours_14.util;

import org.hibernate.SessionFactory;
import org.hibernate.metamodel.Metadata;
import org.hibernate.metamodel.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {

        int hibernateVerstion = 4;

        try {

            /***
             * Hibernate 4
             */
            // Building a SessionFactory  using hibernate.cfg.xml
            if(hibernateVerstion == 4) {
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
            else{
                StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().
                        configure("cours_14/src/hibernate.cfg.xml").
                        build();
                Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
                return metadata.getSessionFactoryBuilder().build();
            }
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

