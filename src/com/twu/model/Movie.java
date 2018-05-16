package com.twu.model;

public class Movie extends Product {


    public Movie() {
    }

    public Movie(int id,String name, String director, String year,boolean available,int rating) {
        this.id = id;
        this.name = name;
        this.director =director;
        this.year = year;
        this.available = available;
        this.rating = rating;
    }

    public String name;
    public String director;
    public int rating;


}
