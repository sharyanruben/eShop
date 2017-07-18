package dataaccess.manager.impl;

import dataaccess.dao.impl.BrandDAOImpl;
import dataaccess.manager.IBrandManager;
import model.Brand;

import java.util.List;

public class BrandManager implements IBrandManager {

    BrandDAOImpl brandDAO;

    public BrandManager() {
        brandDAO = new BrandDAOImpl();
    }


    public void create(Brand brand) {
        brandDAO.create(brand);
    }

    public Brand getEntityByID(int id) {
        return brandDAO.getEntityByID(id);
    }

    public List<Brand> getAll() {
        return brandDAO.getAll();
    }

    public void update(Brand entity) {
        brandDAO.update(entity);
    }

    public void delete(Brand entity) {
brandDAO.delete(entity);
    }
}
