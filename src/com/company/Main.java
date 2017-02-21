package com.company;

import com.company.bean.Book;
import com.company.bean.Library;
import com.company.bean.User;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Справочник по Java","Шилдт"));
        books.add(new Book("Методы Промышленного Программирования","Блинов"));
        books.add(new Book("Философия Джава","Эккель"));

        Library.load(books);

        new Thread(new User("Вася", "Справочник по Java")).start();
        new Thread(new User("Петя", "Справочник по Java")).start();
        new Thread(new User("Вова", "Методы Промышленного Программирования",
                                    "Справочник по Java")).start();

    }
}
