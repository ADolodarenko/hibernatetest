package org.dav.learn.enterprise.hibernatetest.dao;

import org.dav.learn.enterprise.hibernatetest.model.Auto;
import org.dav.learn.enterprise.hibernatetest.model.User;
import org.dav.learn.enterprise.hibernatetest.util.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDAO {
    private Session getSession() {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession();
    }

    public User findById(int id) {
        return getSession().get(User.class, id);
    }

    public void save(User user) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    public void update(User user) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
    }

    public void delete(User user) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }

    public Auto findAutoById(int id) {
        return getSession().get(Auto.class, id);
    }

    public List<User> findAll() {
        List<User> users = (List<User>) getSession().createQuery("From User").list();
        return users;
    }
}
