package dataaccess.dao.impl;

import dataaccess.dao.IWhishListDAO;
import model.WishProduct;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

import java.util.List;

public class WishListDAOImpl implements IWhishListDAO {
    Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public void create(WishProduct wishProduct) {
        session.beginTransaction();
        session.save(wishProduct);
        session.getTransaction().commit();
    }

    @Override
    public WishProduct getEntityByID(int id) {
        return (WishProduct) session.createCriteria(WishProduct.class).add(Restrictions.eq("product_id", id)).uniqueResult();
    }

    @Override
    public List<WishProduct> getAll() {
        return null;
    }

    @Override
    public void update(WishProduct entity) {

    }

    @Override
    public void delete(WishProduct entity) {
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
    }

    @Override
    public List<WishProduct> getProductsFromWishList(int userId) {
        return session.createCriteria(WishProduct.class).add(Restrictions.eq("user_id", userId)).list();
    }
}
