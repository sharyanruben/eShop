package dataaccess.dao.impl;

import dataaccess.dao.ICategoryDAO;
import model.Category;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class CategoryDAOImpl implements ICategoryDAO {
    Session session = HibernateUtil.getSessionFactory().openSession();

    public void create(Category category) {
        session.beginTransaction();
        session.save(category);
        session.getTransaction().commit();
    }

    public Category getEntityByID(int id) {
        return (Category) session.get(Category.class, id);
    }

    public List<Category> getAll() {
        return session.createCriteria(Category.class).list();
    }

    public void update(Category entity) {
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
    }

    public void delete(Category entity) {
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
    }

    public List<Category> getCategoriesByParentId(int id) {
        return (List<Category>) session.createCriteria(Category.class).add(Restrictions.eq("parent_id", id)).list();
    }
}
