package com.twu.model;

public class Book {
    public Book() {
    }

    public Book(String title, String author, String year) {
        this.title = title;
        this.author =author;
        this.year = year;
    }
    public String title;
    public String author;
    public String year;
}
