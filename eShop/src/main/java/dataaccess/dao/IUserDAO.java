package dataaccess.dao;

import model.User;

public interface IUserDAO extends GenericDAO<User> {

    User getUserByEmailAndPassword(String email, String password);

}
