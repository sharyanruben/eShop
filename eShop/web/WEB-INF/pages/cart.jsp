<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<section id="cart_items">
    <div class="container">
        <div class="breadcrumbs">
            <ol class="breadcrumb">
                <li><a href="#">Home</a></li>
                <li class="active">Shopping Cart</li>
            </ol>
        </div>
        <div class="table-responsive cart_info">
            <table class="table table-condensed">
                <thead>
                <tr class="cart_menu">
                    <td class="image">Item</td>
                    <td class="description"></td>
                    <td class="price">Price</td>
                    <td class="quantity">Quantity</td>
                    <td class="total">Total</td>
                    <td></td>
                </tr>
                </thead>

                <s:iterator value="products">
                    <tr>
                        <td class="cart_product">
                            <a href=""><img src="images/cart/one.png" alt=""></a>
                        </td>
                        <td class="cart_description">
                            <h4><a href=""><s:property value="name"/> </a></h4>
                            <p>Web ID: <s:property value="id"/></p>
                        </td>
                        <td class="cart_price">
                            <p>$<s:property value="price"/></p>
                        </td>
                        <form action="checkoutView" method="POST">
                            <%--just comment--%>
                            <td class="cart_quantity">
                                <div class="cart_quantity_button">
                                    <input id="count_<s:property value="id"/>" class="cart_quantity_input" type="number"
                                           min="1" name="quantity" value="1"
                                           autocomplete="off" size="2"
                                           onchange="increase(<s:property value="price"/>,<s:property value="id"/>)"/>

                                    <input id="productId" name="productId" type="hidden"
                                           value="<s:property value="id"/>">
                                </div>
                            </td>
                            <td class="cart_total">
                                <input id="total_<s:property value="id"/>" type="text" value="" readonly>
                                <button type="submit">Order</button>
                            </td>
                        </form>
                        <td class="cart_delete" style="margin-left: 15px">
                            <a class="cart_quantity_delete"
                               href="deleteCart.action?productId=<s:property value="id"/> "><i class="fa fa-times"></i></a>
                        </td>
                    </tr>
                </s:iterator>

            </table>
        </div>
    </div>
</section>
<script>

    function increase(price, id) {

        var count = $("#count_" + id).val();
        var sum = price * count;
        $("#total_" + id).val('$' + sum);
    }
</script>
<!--/#cart_items-->

<section id="do_action">
    <div class="container">
        <div class="heading">
            <h3>What would you like to do next?</h3>
            <p>Choose if you have a discount code or reward points you want to use or would like to estimate your
                delivery cost.</p>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <div class="chose_area">
                    <ul class="user_option">
                        <li>
                            <input type="checkbox">
                            <label>Use Coupon Code</label>
                        </li>
                        <li>
                            <input type="checkbox">
                            <label>Use Gift Voucher</label>
                        </li>
                        <li>
                            <input type="checkbox">
                            <label>Estimate Shipping & Taxes</label>
                        </li>
                    </ul>
                    <ul class="user_info">
                        <li class="single_field">
                            <label>Country:</label>
                            <select>
                                <option>United States</option>
                                <option>Bangladesh</option>
                                <option>UK</option>
                                <option>India</option>
                                <option>Pakistan</option>
                                <option>Ucrane</option>
                                <option>Canada</option>
                                <option>Dubai</option>
                            </select>

                        </li>
                        <li class="single_field">
                            <label>Region / State:</label>
                            <select>
                                <option>Select</option>
                                <option>Dhaka</option>
                                <option>London</option>
                                <option>Dillih</option>
                                <option>Lahore</option>
                                <option>Alaska</option>
                                <option>Canada</option>
                                <option>Dubai</option>
                            </select>

                        </li>
                        <li class="single_field zip-field">
                            <label>Zip Code:</label>
                            <input type="text">
                        </li>
                    </ul>
                    <a class="btn btn-default update" href="">Get Quotes</a>
                    <a class="btn btn-default check_out" href="">Continue</a>
                </div>
            </div>
            <div class="col-sm-6">
                <div class="total_area">
                    <ul>
                        <li>Cart Sub Total <span>$59</span></li>
                        <li>Eco Tax <span>$2</span></li>
                        <li>Shipping Cost <span>Free</span></li>
                        <li>Total <span>$61</span></li>
                    </ul>
                    <a class="btn btn-default update" href="">Update</a>
                    <a class="btn btn-default check_out" href="">Check Out</a>
                </div>
            </div>
        </div>
    </div>
</section>
<!--/#do_action-->
