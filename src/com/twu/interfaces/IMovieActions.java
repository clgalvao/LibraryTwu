package com.twu.interfaces;

import com.twu.model.Movie;

import java.util.List;

public interface IMovieActions {
     Movie findBookByName(String name);
    List<Movie> getAvailableMovies();
    List<Movie> getAllMovies();
    boolean checkoutMovie(String name);

}
