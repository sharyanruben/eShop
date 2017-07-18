package dataaccess.dao.impl;

import dataaccess.dao.IProductDAO;
import model.Products;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

import java.util.List;

public class ProductsDAOImpl implements IProductDAO {


    private Session session = HibernateUtil.getSessionFactory().openSession();

    public void create(Products products) {
        session.beginTransaction();
        session.save(products);
        session.getTransaction().commit();
    }

    public Products getEntityByID(int id) {
        return (Products) session.get(Products.class, id);
    }

    public List<Products> getAll() {
        return session.createCriteria(Products.class).list();
    }

    public void update(Products entity) {

    }

    public void delete(Products entity) {
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
    }

    @Override
    public List<Products> getProductByCatId(int id) {
        return session.createCriteria(Products.class).add(Restrictions.eq("category.id", id)).list();
    }

    @Override
    public List<Products> getProductsByBrandId(int id) {
        return session.createCriteria(Products.class).add(Restrictions.eq("brand.id", id)).list();
    }

    @Override
    public List<Products> searchProductsByName(String name) {
        return session.createCriteria(Products.class).add(Restrictions.ilike("name", "%" + name + "%")).list();
    }

    @Override
    public List<Products> getProductsByPrice(double minPrice, double maxPrice) {
        return session.createCriteria(Products.class).add(Restrictions.between("price", minPrice, maxPrice)).list();
    }
}
