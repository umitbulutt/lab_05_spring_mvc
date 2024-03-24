package com.cydeo.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Cart {
   private UUID id;
   private List<CartItem> cartItemList;
   private BigDecimal cartTotalAmount;

}
