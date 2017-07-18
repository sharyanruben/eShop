package action;

import dataaccess.manager.ICheckoutManager;
import dataaccess.manager.ICountryManager;
import dataaccess.manager.IProductsManager;
import dataaccess.manager.impl.CheckoutManager;
import dataaccess.manager.impl.CountryManager;
import dataaccess.manager.impl.ProductsManager;
import model.Checkout;
import model.User;

public class CheckOutAction extends BaseAction {
    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String zipCode;
    private int countryId;
    private String region;
    private String phone;
    private String mobilePhone;
    private String message;

    private String productId;
    private String quantity;



    @Override
    public String execute() throws Exception {
        Checkout checkout = new Checkout();
        IProductsManager productsManager= new ProductsManager();
        ICheckoutManager checkoutManager= new CheckoutManager();
        ICountryManager countryManager= new CountryManager();
        checkout.setUser((User) session.get("user"));
        checkout.setProduct(productsManager.getEntityByID(Integer.parseInt(productId)));
        checkout.setEmail(email);
        checkout.setFirstName(firstName);
        checkout.setLastName(lastName);
        checkout.setAddress(address);
        checkout.setZipCode(zipCode);
        checkout.setCountry(countryManager.getEntityByID(countryId));
        checkout.setRegion(region);
        checkout.setPhone(phone);
        checkout.setMobilePhone(mobilePhone);
        checkout.setMessage(message);
        checkoutManager.create(checkout);
        return SUCCESS;
    }

    public String view() {

        return SUCCESS;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
