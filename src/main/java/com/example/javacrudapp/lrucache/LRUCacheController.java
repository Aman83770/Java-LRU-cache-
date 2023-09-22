package com.example.javacrudapp.lrucache;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("cache/v1/")
public class LRUCacheController implements Cache {

    private final HashMap<String, String> elements;
    private final  LinkedList linkedList;

    public LRUCacheController() {
        this.linkedList = null;
        this.elements = new HashMap<String, String>;
    }

    @Override
    @PostMapping("ADD")
    public String insert(@RequestBody("key") String key, @RequestBody("value") String value) {
        elements.put(key, value);
        linkedList.add(key);
        return null;
    }

    @GetMapping("GET")
    public String get(String key) {
        // First find from map
        String element = elements.get(key);

        // add in top of linkedlist
        linkedList.findAndInsert(key);
        return null;
    }


}
