package dataaccess.dao.impl;

import dataaccess.dao.IUserDAO;
import model.User;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

import java.util.List;

public class UserDAOImpl implements IUserDAO {
    private Session session;

    public UserDAOImpl() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void create(User user) {
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
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

        return (User) session.createCriteria(User.class).add(Restrictions.eq("email", email)).add(Restrictions.eq("password", password)).uniqueResult();


    }
}
