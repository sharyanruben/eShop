package dataaccess.dao;

import model.WishProduct;

import java.util.List;

public interface IWhishListDAO extends GenericDAO<WishProduct> {
    List<WishProduct> getProductsFromWishList(int userId);
}
