package com.ezzel.model;

import com.ezzel.Burger;

/**
 * Created by Ezzel on 1/30/2016.
 */
public class CheeseBurger extends Burger {
    @Override
    public String name() {
        return "Cheese Burger";
    }

    @Override
    public float price() {
        return 2.00f;
    }
}
