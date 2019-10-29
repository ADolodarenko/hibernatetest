package org.dav.learn.enterprise.hibernatetest.util;

import org.dav.learn.enterprise.hibernatetest.model.Auto;
import org.dav.learn.enterprise.hibernatetest.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration().configure();  //"/resources/hibernate.cfg.xml"
            configuration.addAnnotatedClass(User.class);
            configuration.addAnnotatedClass(Auto.class);
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(
                    configuration.getProperties());
            sessionFactory = configuration.buildSessionFactory(builder.build());
        }

        return sessionFactory;
    }

    private HibernateSessionFactoryUtil() {}
}
