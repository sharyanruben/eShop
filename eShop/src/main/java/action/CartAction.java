package action;

import dataaccess.manager.impl.CartManager;
import model.Cart;
import model.Products;
import model.User;

import java.util.List;

public class CartAction extends BaseAction {
    private List<Cart> cartList;
    private String productId;
    private List<Products> products;

    CartManager cartManager = new CartManager();

    @Override
    public String execute() throws Exception {
        User user = (User) session.get("user");
        products = cartManager.getProductsByUserId(user.getId());
        return SUCCESS;
    }

    public String addToCart() {
        Cart cart = new Cart();
        User user = (User) session.get("user");
        if (user != null) {
            cart.setProduct_id(Integer.parseInt(productId));
            cart.setUser_id(user.getId());
            cartManager.create(cart);
            return SUCCESS;
        }
        return ERROR;
    }

    public String deleteFromCart() {
        Cart cart = cartManager.getEntityByID(Integer.parseInt(productId));

        if (cart != null) {
            cartManager.delete(cart );
            return SUCCESS;
        }
        return ERROR;
    }

    public String getProductId() {
        return productId;
    }

    public void  setProductId(String productId) {
        this.productId = productId;
    }

    public List<Cart> getCartList() {
        return cartList;
    }

    public void setCartList(List<Cart> cartList) {
        this.cartList = cartList;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }
}
