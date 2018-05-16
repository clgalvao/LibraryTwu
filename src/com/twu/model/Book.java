package com.twu.model;

public class Book {
    public Book() {
    }

    public Book(int id,String title, String author, String year,boolean available) {
        this.id = id;
        this.title = title;
        this.author =author;
        this.year = year;
        this.available = available;
    }

    public int id;
    public String title;
    public String author;
    public String year;
    public boolean available;

}
