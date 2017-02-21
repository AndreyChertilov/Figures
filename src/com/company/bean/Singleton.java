package com.company.bean;

/**
 * Created by Kiryl_Parfiankou on 2/21/2017.
 */
public class Singleton {

    private static Library library;

    private Singleton() {

    }

    public synchronized static Library getInstance(){

        if (library == null) {
            library = new Library();
        }

        return library;
    }

}
