package com.ezzel;

import com.ezzel.Interface.Item;
import com.ezzel.Interface.Packing;

/**
 * Created by Ezzel on 1/30/2016.
 */
public abstract class ColdDrink  implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

}
