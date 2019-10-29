package org.dav.learn.enterprise.hibernatetest.service;

import org.dav.learn.enterprise.hibernatetest.dao.UserDAO;
import org.dav.learn.enterprise.hibernatetest.model.Auto;
import org.dav.learn.enterprise.hibernatetest.model.User;

import java.util.List;

public class UserService {
    private UserDAO userDAO = new UserDAO();

    public UserService() {}

    public User findUser(int id) {
        return userDAO.findById(id);
    }

    public void saveUser(User user) {
        userDAO.save(user);
    }

    public void updateUser(User user) {
        userDAO.update(user);
    }

    public void deleteUser(User user) {
        userDAO.delete(user);
    }

    public List<User> findAllUsers() {
        return userDAO.findAll();
    }

    public Auto findAutoById(int id) {
        return userDAO.findAutoById(id);
    }
}
