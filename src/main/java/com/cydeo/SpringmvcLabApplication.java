package com.cydeo;

import com.cydeo.service.CartService;
import com.cydeo.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringmvcLabApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringmvcLabApplication.class, args);

        ProductService productService = context.getBean(ProductService.class);
        productService.initialiseProductList();

        CartService cartService = context.getBean(CartService.class);
        cartService.initialiseCartList();
    }

}
