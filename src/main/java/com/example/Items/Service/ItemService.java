package com.example.Items.Service;

import com.example.Items.Contracts.Items;
import com.example.Items.Model.Item;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ItemService implements Items {
    private long itemIdCounter = 0L;

    public long getItemIdCounter() {
        return itemIdCounter;
    }

    public void setItemIdCounter(long itemIdCounter) {
        this.itemIdCounter = itemIdCounter;
    }

    private static Map<Long, String> items = new HashMap<>();
    static {
        items.put(1L, "mobile phone");
        items.put(2L, "computer");
        items.put(3L, "Desktop");
    }
    @Override
    public Map<Long, String> getAllItems() {
        return items;
    }
    @Override
    public String getItem(Long itemID){
        if (items.containsKey(itemID)) {
            return items.get(itemID);
        } else {
            throw new ItemNotFoundException("Item not found with ID: " + itemID);
        }
    }
    @Override
    public Item addItem(Item item){
        Long id = itemIdCounter++;
        item.setItemID(id);
        items.put(id, String.valueOf(item));
        return item;
    }
   @Override
    public String deleteItem(Long itemID){
       if (items.containsKey(itemID)) {
           items.remove(itemID);
           return "Item" +itemID+ "deleted";
       } else {
           throw new ItemNotFoundException("Item not found with id " + itemID);
       }
   }
    @Override
    public Item updateItem(Long itemID, Item updatedItem){
        if (items.containsKey(itemID)) {
            updatedItem.setItemID(itemID);
            items.put(itemID, String.valueOf(updatedItem));
            return updatedItem;
        } else {
            throw new ItemNotFoundException("Item not found with id " + itemID);
        }
    }
    }
