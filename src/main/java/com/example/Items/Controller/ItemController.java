package com.example.Items.Controller;

import com.example.Items.Model.Item;
//import com.example.Items.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
/*
@RestController
@RequestMapping("/items")
public class ItemController {
    final private ItemService itemService;
    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }
    @GetMapping("/{id}")
    ResponseEntity<?> getItem(@PathVariable("id") Long id) {
        if(id == null){
            return ResponseEntity.badRequest().body("Invalid ID");
        }
      //  Item item = itemService.getItem(id);
        return ResponseEntity.ok("added");
    }

    @GetMapping
    public Map<Long, String> getAllItems() {
        return itemService.getAllItems();
    }

    @PostMapping("/post/item")
    public ResponseEntity<String> createItem(@RequestBody Item item) {
        try {
            this.itemService.addItem(item);
            return ResponseEntity.ok("Item added successfully");
        }
        catch (IllegalArgumentException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateItem(@PathVariable Long id, @RequestBody Item item) {
        itemService.updateItem(id, item);
        return ResponseEntity.ok("Item updated successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteItem(@PathVariable Long id) {
        this.itemService.deleteItem(id);
        return ResponseEntity.ok("Item deleted successfully");
    }

}*/
