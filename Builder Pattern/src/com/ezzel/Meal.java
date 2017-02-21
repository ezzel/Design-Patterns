package com.ezzel;

import com.ezzel.Interface.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ezzel on 1/30/2016.
 */
public class Meal {
    List<Item> items;

    public Meal() {
        items = new ArrayList<Item>();
    }
    public void addItem(Item item)
    {
        items.add(item);
    }
    public float getCost(){
        float cost=0;
        for (Item item: items) {
        cost=cost+item.price();
        }
        return cost;

    }
    public void showItems(){
        System.out.println("The items included in the meal are");

        for (Item item:items
             ) { System.out.println(item.name()+" It's price: $"+item.price());

              }
        System.out.println("The total cost is $"+getCost());


    }
}
