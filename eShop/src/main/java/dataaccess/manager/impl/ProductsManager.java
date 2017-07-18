package dataaccess.manager.impl;

import dataaccess.dao.impl.ProductsDAOImpl;
import dataaccess.manager.IProductsManager;
import model.Products;

import java.util.List;

public class ProductsManager implements IProductsManager {
    private ProductsDAOImpl productsDAO;

    public ProductsManager() {
        productsDAO = new ProductsDAOImpl();
    }

    public void create(Products products) {
        productsDAO.create(products);
    }

    public Products getEntityByID(int id) {
        return productsDAO.getEntityByID(id);
    }

    public List<Products> getAll() {
        return productsDAO.getAll();
    }

    public void update(Products entity) {

    }

    public void delete(Products entity) {
        productsDAO.delete(entity);
    }

    public List<Products> getProductByCatId(int id) {
        return productsDAO.getProductByCatId(id);
    }

    @Override
    public List<Products> getProductsByBrandId(int id) {
        return productsDAO.getProductsByBrandId(id);
    }

    @Override
    public List<Products> searchProductsByName(String name) {
        return productsDAO.searchProductsByName(name);
    }

    @Override
    public List<Products> getProductsByPrice(double minPrice, double maxPrice) {
        return productsDAO.getProductsByPrice(minPrice,maxPrice);
    }


}
