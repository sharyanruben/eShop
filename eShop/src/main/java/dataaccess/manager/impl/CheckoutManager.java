package dataaccess.manager.impl;

import dataaccess.dao.ICheckoutDAO;
import dataaccess.dao.impl.CheckoutDAOImpl;
import dataaccess.manager.ICheckoutManager;
import model.Checkout;

import java.util.List;

public class CheckoutManager implements ICheckoutManager {
    private ICheckoutDAO checkoutDAO;

    public CheckoutManager(){
        checkoutDAO= new CheckoutDAOImpl();

    }

    @Override
    public void create(Checkout checkout) {
        checkoutDAO.create(checkout);
    }

    @Override
    public Checkout getEntityByID(int id) {
        return checkoutDAO.getEntityByID(id);
    }

    @Override
    public List<Checkout> getAll() {
        return checkoutDAO.getAll();
    }

    @Override
    public void update(Checkout entity) {
        checkoutDAO.update(entity);
    }

    @Override
    public void delete(Checkout entity) {
        checkoutDAO.delete(entity);
    }
}
