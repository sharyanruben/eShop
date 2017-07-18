package dataaccess.manager;

import model.User;

public interface IUserManager extends ManagerGeneric<User> {

    User getUserByEmailAndPassword(String email, String password);
}
