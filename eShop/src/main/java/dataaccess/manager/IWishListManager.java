package dataaccess.manager;

import model.Products;
import model.WishProduct;

import java.util.List;

public interface IWishListManager extends ManagerGeneric<WishProduct> {
    List<Products> getProductsByUserId(int userId);
}
