package dataaccess.manager.impl;

import dataaccess.dao.IUserDAO;
import dataaccess.dao.impl.UserDAOImpl;
import dataaccess.manager.IUserManager;
import model.User;


import java.util.List;

public class UserManager implements IUserManager {

    private IUserDAO userDAO = new UserDAOImpl();

    public void create(User user) {
        userDAO.create(user);
    }

    public User getEntityByID(int id) {
        return null;
    }

    public List<User> getAll() {
        return null;
    }

    public void update(User entity) {

    }

    public void delete(User entity) {

    }

    public User getUserByEmailAndPassword(String email, String password) {
        return userDAO.getUserByEmailAndPassword(email, password);

    }



}
