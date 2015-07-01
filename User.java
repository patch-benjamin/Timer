package com.example.benjaminpatch.timer;

import java.util.ArrayList;
import java.util.Map;


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

    public void setHighestLevel(int newHighestLevel){
        highestLevel = newHighestLevel;
    }

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
