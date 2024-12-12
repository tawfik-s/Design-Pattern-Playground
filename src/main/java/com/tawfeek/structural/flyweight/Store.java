package com.tawfeek.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Book> books = new ArrayList<>();

    public void StoreBook(String name, double price, String type){
        BookType bookType = BookFactory.getBookType(type);
        books.add(new Book(name,price,bookType));
    }

}
