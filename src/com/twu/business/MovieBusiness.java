package com.twu.business;

import com.twu.Repository.BookRepository;
import com.twu.Repository.MovieRepository;
import com.twu.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieBusiness {
    MovieRepository movieRepository = new MovieRepository();

    public Movie findBookByName(String name)
    {
     return new Movie();
    }

     public List<Movie> getAvailableMovies() {

        return movieRepository.getAvailableMovies();
     }

    public List<Movie> getAllMovies() {
        return movieRepository.getAllMovies();
    }
}
