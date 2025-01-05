package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Joe", "Biden", (byte) 80);
        userService.saveUser("Donald", "Trump", (byte) 60);
        userService.saveUser("Jd", "Vance", (byte) 89);
        userService.saveUser("Bart", "Simpson", (byte) 20);

        List<User> usersList = userService.getAllUsers();
        for (User user : usersList) {
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

