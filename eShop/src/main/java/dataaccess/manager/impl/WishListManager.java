package dataaccess.manager.impl;

import dataaccess.dao.impl.ProductsDAOImpl;
import dataaccess.dao.impl.WishListDAOImpl;
import dataaccess.manager.IWishListManager;
import model.Products;
import model.WishProduct;

import java.util.ArrayList;
import java.util.List;

public class WishListManager implements IWishListManager {

    private WishListDAOImpl wishListDAO;
    private ProductsDAOImpl productsDAO;

    public WishListManager() {
        wishListDAO = new WishListDAOImpl();
        productsDAO = new ProductsDAOImpl();
    }

    @Override
    public void create(WishProduct wishProduct) {
        wishListDAO.create(wishProduct);
    }

    @Override
    public WishProduct getEntityByID(int id) {
        return wishListDAO.getEntityByID(id);
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

        wishListDAO.delete(entity);
    }

    @Override
    public List<Products> getProductsByUserId(int userId) {
        List<WishProduct> wishProducts = wishListDAO.getProductsFromWishList(userId);
        System.out.println(wishProducts);
        ProductsManager productsManager = new ProductsManager();
        List<Products> products = new ArrayList<>();
        for (WishProduct wishProduct : wishProducts) {
            Products product = productsManager.getEntityByID(wishProduct.getProduct_id());
            products.add(product);
        }
        return products;
    }
}
