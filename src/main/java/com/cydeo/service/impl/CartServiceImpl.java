package com.cydeo.service.impl;

import com.cydeo.model.Cart;
import com.cydeo.model.CartItem;
import com.cydeo.service.CartService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.cydeo.service.impl.ProductServiceImpl.PRODUCT_LIST;

@Service
public class CartServiceImpl implements CartService {

    public static List<Cart> CART_LIST = new ArrayList<>();

    @Override
    public List<Cart> retrieveCartList() {
        return CART_LIST;
    }

    @Override
    public List<CartItem> retrieveCartDetail(UUID cartId) {
        // todo implement method using stream
        return new ArrayList<>();
    }

    @Override
    public void initialiseCartList() {

        // creating cart items
        CartItem cartItem1 = new CartItem();
        cartItem1.setQuantity(3);
        cartItem1.setProduct(PRODUCT_LIST.get(0));
        cartItem1.setTotalAmount(cartItem1.getProduct().getPrice().multiply(new BigDecimal(cartItem1.getQuantity())));

        CartItem cartItem2 = new CartItem();
        cartItem2.setQuantity(4);
        cartItem2.setProduct(PRODUCT_LIST.get(2));
        cartItem2.setTotalAmount(cartItem2.getProduct().getPrice().multiply(new BigDecimal(cartItem2.getQuantity())));

        CartItem cartItem3 = new CartItem();
        cartItem3.setQuantity(5);
        cartItem3.setProduct(PRODUCT_LIST.get(1));
        cartItem3.setTotalAmount(cartItem3.getProduct().getPrice().multiply(new BigDecimal(cartItem3.getQuantity())));

        CartItem cartItem4 = new CartItem();
        cartItem4.setQuantity(6);
        cartItem4.setProduct(PRODUCT_LIST.get(3));
        cartItem4.setTotalAmount(cartItem4.getProduct().getPrice().multiply(new BigDecimal(cartItem4.getQuantity())));

        List<CartItem> cartItemList1 = new ArrayList<>(List.of(cartItem1, cartItem2));
        List<CartItem> cartItemList2 = new ArrayList<>(List.of(cartItem3, cartItem4));

        // initialising cart 1
        Cart cart1 = new Cart();
        cart1.setId(UUID.randomUUID());
        cart1.setCartItemList(cartItemList1);

        BigDecimal cart1TotalAmount = BigDecimal.ZERO;

        // todo change to stream
        for (CartItem cartItem : cartItemList1) {
            cart1TotalAmount = cart1TotalAmount.add(cartItem.getTotalAmount());
        }

        cart1.setCartTotalAmount(cart1TotalAmount);

        // initialising cart 2
        Cart cart2 = new Cart();
        cart2.setId(UUID.randomUUID());
        cart2.setCartItemList(cartItemList2);

        BigDecimal cart2TotalAmount = BigDecimal.ZERO;

        // todo change to stream
        for (CartItem cartItem : cartItemList2) {
            cart2TotalAmount = cart2TotalAmount.add(cartItem.getTotalAmount());
        }

        cart2.setCartTotalAmount(cart2TotalAmount);

        // saving carts
        CART_LIST.addAll(List.of(cart1, cart2));

    }
}
