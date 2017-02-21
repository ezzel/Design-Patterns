package com.ezzel.model;

import com.ezzel.ColdDrink;

/**
 * Created by Ezzel on 1/30/2016.
 */
public class Pepsi extends ColdDrink

{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 1.00f;
    }
}
