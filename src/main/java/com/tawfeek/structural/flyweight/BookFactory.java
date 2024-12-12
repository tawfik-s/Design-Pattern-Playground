package com.tawfeek.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    private static Map<String,BookType> bookTypes = new HashMap<>();

    public static BookType getBookType(String type) {
        if (!bookTypes.containsKey(type)) {
            bookTypes.put(type,new BookType("ddia","tawfeek","science"));
        }
        return bookTypes.get(type);
    }

}
