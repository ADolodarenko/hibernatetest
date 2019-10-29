package org.dav.learn.enterprise.hibernatetest;

import org.dav.learn.enterprise.hibernatetest.model.Auto;
import org.dav.learn.enterprise.hibernatetest.model.User;
import org.dav.learn.enterprise.hibernatetest.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();

        User user = new User("Kolya", 156);
        service.saveUser(user);

        user.addAuto(new Auto("Lada Kalina", "yellow"));
        user.addAuto(new Auto("Mercedes", "black"));

        service.updateUser(user);

        user.setName("Nikolay the Second!");
        user.setAge(8);

        service.updateUser(user);

        service.deleteUser(user);
    }
}
