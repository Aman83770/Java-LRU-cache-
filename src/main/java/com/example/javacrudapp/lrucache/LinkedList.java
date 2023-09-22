package com.example.javacrudapp.lrucache;

import java.util.List;

public class LinkedList {
    public final List<NodeDTO> data;

    public LinkedList(List<NodeDTO> data) {
        this.data = data;
    }

    void add(String value) {
        NodeDTO obj = new NodeDTO();
        obj.val = value;
        obj.prev = null;
        obj.next = null;
        data.add(obj);
    }

    Boolean remove(String address) {
        NodeDTO element = null;
        // find the element via address

        if (element == null) {
            return false;
        }

    }

    // find tghe element if it is there then remove and insert in front
    void findAndInsert(String value) {
        // call the remove
        remove(value);

        // insert in the front

    }
}
