package com.drone.dronesys;

import java.util.StringJoiner;
import java.util.concurrent.atomic.AtomicInteger;

public class Item {
    // Item ID, name and weight
    private Integer itemID;
    private static AtomicInteger id_init = new AtomicInteger(1000);    // Auto increment id for new items
    private String itemName;
    private Integer itemWeight;
    private Position itemPos;

    public Item(){}
    // Construct an item instance with given properties
    public Item(String itemName, Integer itemWeight, Position itemPos)
    {
        this.itemID = id_init.getAndIncrement();
        this.itemName = itemName;
        this.itemWeight = itemWeight;
        this.itemPos = itemPos;
    }

    @Override
    public String toString() {
        return new StringJoiner(
                "|",
                Item.class.getSimpleName() + "[ ",
                "]"
        )
                .add ("ID = " + itemID)
                .add("Name = " + itemName)
                .add("Weight = " + itemPos)
                .add(" Position = " + itemPos.toString())
                .toString();
    }
}
