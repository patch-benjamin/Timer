package com.example.benjaminpatch.timer;

public class Book {
    String name;
    int pagesPerLine;

    public Book(String newName, int newPages){
        setName(newName);
        setPagesPerLine(newPages);
    }

    //have to make some changes in order to push this...
    public String getName(){
        return name;
    }

    /**
     * a common set method
     * @param newName a new name for the book
     */

    public void setName(String newName){
        name = newName;
    }
    public int getPagesPerLine(){
        return pagesPerLine;
    }
    public void setPagesPerLine(int newPages){
        pagesPerLine = newPages;
    }

}
