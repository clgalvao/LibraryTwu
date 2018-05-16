package com.twu.model;

public class Book extends Product{
    public Book() {
    }

    public Book(int id,String title, String author, String year,boolean available) {
        this.id = id;
        this.title = title;
        this.author =author;
        this.year = year;
        this.available = available;
    }

    public String title;
    public String author;


}
