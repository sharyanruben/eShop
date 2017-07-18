package dataaccess.dao;

import model.Cart;

import java.util.List;

public interface ICartDAO extends GenericDAO<Cart> {
    List<Cart> getProductsFromCart(int id);
}
