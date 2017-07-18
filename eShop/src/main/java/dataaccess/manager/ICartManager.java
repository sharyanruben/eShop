package dataaccess.manager;

import model.Cart;
import model.Products;

import java.util.List;

public interface ICartManager extends ManagerGeneric<Cart>{
    List<Products> getProductsByUserId(int id);
}
