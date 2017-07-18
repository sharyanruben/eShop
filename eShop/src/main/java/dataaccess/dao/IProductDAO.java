package dataaccess.dao;

import model.Products;

import java.util.List;

public interface IProductDAO extends GenericDAO<Products> {
    List<Products> getProductByCatId(int id);

    List<Products> getProductsByBrandId(int id);

    List<Products> searchProductsByName(String name);

    List<Products> getProductsByPrice(double minPrice, double maxPrice);
}
