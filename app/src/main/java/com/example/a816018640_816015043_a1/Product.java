package com.example.a816018640_816015043_a1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Product implements Serializable {

    String Item;
    String specs;


    public Product(String itemName, String itemSpecs){
        Item=itemName;
        specs=itemSpecs;
    }

}
