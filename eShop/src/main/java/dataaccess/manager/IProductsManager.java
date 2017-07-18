package dataaccess.manager;

import model.Products;

import java.util.ArrayList;
import java.util.List;

public interface IProductsManager extends ManagerGeneric<Products> {
    List<Products> getProductByCatId(int id);

    List<Products> getProductsByBrandId(int id);

    List<Products> searchProductsByName(String name);

    List<Products> getProductsByPrice(double minPrice, double maxPrice);
}
