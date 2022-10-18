package com.drone.dronesys;

public class Item {
    // Item ID, name and weight
    private Integer itemID;
    private String itemName;
    private Integer itemWeight;

    public Item(){}
    // Construct an item instance with given properties
    public Item(Integer itemID, String itemName, Integer itemWeight)
    {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemWeight = itemWeight;
    }
}
