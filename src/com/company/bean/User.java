package com.company.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Kiryl_Parfiankou on 2/21/2017.
 */
public class User implements Runnable {

    private String name;
    private String[] preferences;
    private List<Book> books;

    public User(String name, String... preferences) {
        this.name = name;
        this.preferences = preferences;
        this.books = new ArrayList<>();
    }

    @Override
    public void run() {
        //Set<Book> books = Library.getInstance();
        if (preferences != null) {
            for(String bookName: preferences) {
                Book book = Library.getBook(bookName);
                if (book == null) {
                    System.out.println(name + ": Нет книги");
                } else {
                    books.add(book);
                }

            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Book book: books) {
            stringBuilder.append(book.getName() + ",");
        }
        System.out.println(name + " взял: " + stringBuilder.toString());
    }
}
