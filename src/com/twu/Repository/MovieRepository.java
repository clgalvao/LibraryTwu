package com.twu.Repository;


import com.twu.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    public static List<Movie> movieList = new ArrayList<>();

    public List<Movie> getAllMovies() {

        if((movieList.size() == 0)) {
            movieList = new ArrayList<>();
            movieList.add(new Movie(1, "LotR:Fellowship of the Ring", "J.R.R Tolkien", "1954", true,3));
            movieList.add(new Movie(2, "The Hobbit", "J.R.R Tolkien", "1937", true,5));
            movieList.add(new Movie(3, "Silmarilion", "J.R.R Tolkien", "1977", false,8));

            return movieList;
        }
        return movieList;
    }

    public  List<Movie> getAvailableMovies() {
        List<Movie> availableMovies = new ArrayList<>();
        for (int i = 0; i < getAllMovies().size(); i++)
        {
            if (getAllMovies().get(i).available)
                availableMovies.add(getAllMovies().get(i));
        }
        return availableMovies;
    }


    public boolean checkoutMovie(String name)
    {
        List<Movie> movieStore = getAllMovies();
        if (findMovieByName(name).available)
        {
            Movie checkoutMovie = findMovieByName(name);
            checkoutMovie.available = false;
            movieStore.remove(movieStore.indexOf(checkoutMovie));
            movieStore.add(checkoutMovie);
            return true;
        }

        return false;
    }

    private Movie findMovieByName(String name) {
        Movie lookingMovie = new Movie();
        for (int i = 0; i < getAllMovies().size(); i++)
        {
            if(getAllMovies().get(i).name.equals(name))
                lookingMovie = getAllMovies().get(i);
        }
        return lookingMovie;
    }
}
