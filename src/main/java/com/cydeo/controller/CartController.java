package com.cydeo.controller;


import com.cydeo.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@Controller
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping("/cart-list")
    public String getCartList(Model model ){

        model.addAttribute("cartList",cartService.retrieveCartList());

        return "/cart/cart-list";
    }

    @GetMapping("/cart-list/{cartId}")
    public String getCartItemList(Model model, @PathVariable UUID cartId){

        model.addAttribute("cartItemList",cartService.retrieveCartDetail(cartId));

        return "cart/cart-detail";
    }
}
