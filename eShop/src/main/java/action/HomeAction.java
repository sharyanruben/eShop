package action;

import dataaccess.manager.impl.ProductsManager;

import model.Products;


import java.util.ArrayList;

public class HomeAction extends BaseAction {

    private ArrayList<Products> products;


    private ProductsManager productsManager;

    public HomeAction() {
        productsManager = new ProductsManager();

    }

    @Override
    public String execute() throws Exception {
        products = (ArrayList<Products>) productsManager.getAll();
        return SUCCESS;
    }

    public ArrayList<Products> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Products> products) {
        this.products = products;
    }


}
