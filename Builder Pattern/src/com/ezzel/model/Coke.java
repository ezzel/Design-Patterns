package com.ezzel.model;

import com.ezzel.ColdDrink;

/**
 * Created by Ezzel on 1/30/2016.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 1.00f;
    }
}
