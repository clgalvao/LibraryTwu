package com.twu.biblioteca;
import java.util.ArrayList;
import java.util.List;
import com.twu.business.MovieBusiness;
import com.twu.model.Movie;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;


public class MovieBusinessTest
{
    @Test
    public void shouldReturnAMovie() {
        MovieBusiness movieBusinessTest = new MovieBusiness();
        Movie movieTest = new Movie();
        Assert.assertEquals(movieTest.getClass(),movieBusinessTest.findBookByName("Triple X").getClass());
    }

    @Test
    public void shouldReturnAListWithAllMovies() {
        MovieBusiness movieBusinessTest = new MovieBusiness();
        List<Movie> listAvailable = movieBusinessTest.getAvailableMovies();
        Assert.assertNotEquals(listAvailable,movieBusinessTest.getAllMovies());
    }
}
