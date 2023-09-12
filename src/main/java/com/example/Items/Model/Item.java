package com.example.Items.Model;

public class Item {
    private String itemName;
    private Long itemID;
    public Item(String itemName, Long itemID) {
        itemName = itemName;
        this.itemID = itemID;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        itemName = itemName;
    }

    public Long getItemID() {
        return itemID;
    }

    public void setItemID(Long itemID) {
        this.itemID = itemID;
    }

    @Override
    public String toString() {
        return "Item{" +
                "ItemName='" + itemName + '\'' +
                ", itemID=" + itemID +
                '}';
    }
}
