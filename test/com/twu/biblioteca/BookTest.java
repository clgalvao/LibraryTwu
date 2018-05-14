package com.twu.biblioteca;
import com.twu.business.*;
import com.twu.model.Book;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;


public class BookTest {

    private BookBusiness bookBusinessTest = new BookBusiness();

    @Test
    public void shouldReturnAListOfBooks()
    {
        HashMap<String,Book> bookCompare = new HashMap<>();
        bookCompare.put("1",new Book());

        Assert.assertEquals(bookCompare.getClass(),bookBusinessTest.seedBooks().getClass());
    }

    @Test
    public void shouldReturnBookIntoAList()
    {
        Book bookCompare = new Book();
        Assert.assertEquals(bookCompare.getClass(),bookBusinessTest.seedBooks().get("1").getClass());
    }


    @Test
    public void shouldReturnAListWithBooks()
    {
        HashMap<String,Book> bookCompare = new HashMap<>();
        bookCompare.put("1",new Book(1,"LotR:Fellowship of the Ring","J.R.R Tolkien", "1954",true));
        bookCompare.put("2",new Book(2,"The Hobbit","J.R.R Tolkien", "1937",true));
        bookCompare.put("3",new Book(3,"Silmarilion","J.R.R Tolkien", "1977",true));
        Assert.assertThat(bookBusinessTest.seedBooks().size(),is(not(0)));
    }

    @Test
    public void checkoutABook() {
        Assert.assertTrue(bookBusinessTest.checkOutBook("1"));
    }

    @Test
    public void checkInABook() {
        Assert.assertTrue(bookBusinessTest.checkInBook("2"));
    }
}
