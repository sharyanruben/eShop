package dataaccess.dao.impl;

import dataaccess.dao.ICheckoutDAO;
import model.Checkout;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

public class CheckoutDAOImpl implements ICheckoutDAO {
    private Session session;

    public CheckoutDAOImpl() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public void create(Checkout checkout) {
        session.beginTransaction();
        session.save(checkout);
        session.getTransaction().commit();
    }

    @Override
    public Checkout getEntityByID(int id) {
        return (Checkout) session.get(Checkout.class,id);
    }

    @Override
    public List<Checkout> getAll() {
        return session.createCriteria(Checkout.class).list();
    }

    @Override
    public void update(Checkout entity) {
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Checkout entity) {
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
    }
}
