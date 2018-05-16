package com.twu.business;

import com.twu.Repository.BookRepository;
import com.twu.Repository.MovieRepository;
import com.twu.interfaces.IMovieActions;
import com.twu.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieBusiness implements IMovieActions {
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

    public boolean checkoutMovie(String name) {
        return movieRepository.checkoutMovie(name);
    }
}
