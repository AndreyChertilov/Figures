package com.company.bean;

import com.sun.javafx.collections.MappingChange;

import java.util.*;

/**
 * Created by Kiryl_Parfiankou on 2/21/2017.
 */
public class Library {

    private static Map<String, Book> books = new HashMap<String,Book>();

    public Library(){
    }

    public static synchronized void load(List<Book> booksList) {
        for(Book book: booksList) {
            books.put(book.getName(), book);
        }
    }

    public static synchronized List<String> getInstance() {
        return new ArrayList<String>(books.keySet());
    }

    public static synchronized Book getBook(String bookName) {

        Book book = books.get(bookName);

        if (book != null) {
            books.remove(book.getName());
        }

        return book;
    }

}
