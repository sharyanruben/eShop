package dataaccess.dao.impl;

import dataaccess.dao.IBrandDAO;
import model.Brand;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

public class BrandDAOImpl implements IBrandDAO {

    Session session = HibernateUtil.getSessionFactory().openSession();

    public void create(Brand brand) {
        session.beginTransaction();
        session.save(brand);
        session.getTransaction().commit();
    }

    public Brand getEntityByID(int id) {
        return (Brand) session.get(Brand.class, id);
    }

    public List<Brand> getAll() {
        return session.createCriteria(Brand.class).list();
    }

    public void update(Brand entity) {
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
    }

    public void delete(Brand entity) {
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
    }
}
