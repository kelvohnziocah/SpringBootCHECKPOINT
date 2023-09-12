package com.example.Items.Contracts;

import com.example.Items.Model.Item;

import java.util.Map;

public interface Items {
    public Item addItem(Item item);
    public String deleteItem(Long itemID);
    public Item updateItem(Long itemID, Item item);
    public String getItem(Long itemID);
    public Map<Long, String> getAllItems();
}
