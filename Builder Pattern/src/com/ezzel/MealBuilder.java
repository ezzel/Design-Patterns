package com.ezzel;

import com.ezzel.model.CheeseBurger;
import com.ezzel.model.Coke;
import com.ezzel.model.VegBurger;

/**
 * Created by Ezzel on 1/30/2016.
 */
public class MealBuilder {
    public Meal cheeseBurgerMeal(){
        Meal meal=new Meal();
        meal.addItem(new CheeseBurger());
        meal.addItem(new Coke());
        return meal;

    }
    public Meal vegeeBurgerMeal(){
        Meal meal=new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;

    }
}
