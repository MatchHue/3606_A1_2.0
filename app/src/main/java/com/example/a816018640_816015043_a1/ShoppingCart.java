package com.example.a816018640_816015043_a1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Serializable {

    List<Product> cart=new ArrayList<Product>();

    public void addToCart(Product item){

        cart.add(item);
    }

}
