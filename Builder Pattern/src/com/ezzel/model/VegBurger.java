package com.ezzel.model;

import com.ezzel.Burger;

/**
 * Created by Ezzel on 1/30/2016.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veggie Burger";
    }

    @Override
    public float price() {
        return 1.00f;
    }
}
