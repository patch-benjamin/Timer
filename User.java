package com.example.benjaminpatch.timer;

import java.util.ArrayList;
import java.util.Map;

/**
 * a class for each user. contains the books they are reading,
 * the highest level they have completed, and their name.
 */
public class User {
    String name;
    int highestLevel;
    ArrayList<Book> books;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    /**
     * a simple setter
     * @param newHighestLevel the highest level completed by this user
     */
    public void setHighestLevel(int newHighestLevel){
        highestLevel = newHighestLevel;
    }

    /**
     * a simple getter.
     * @return return the int of the highest level completed by this user.
     */
    public int getHighestLevel(){
        return highestLevel;
    }

    public void addBook(String bookName, int pagesPerLine){
        Book book = new Book(bookName, pagesPerLine);
        books.add(book);
    }
    public ArrayList<Book> getBooks(){
        return books;
    }
}
