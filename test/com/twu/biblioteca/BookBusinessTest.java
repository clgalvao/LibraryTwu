package com.twu.biblioteca;
import com.twu.business.*;
import com.twu.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;


public class BookBusinessTest {

    private BookBusiness bookBusinessTest = new BookBusiness();

    @Test
    public void shouldReturnAListOfBooks()
    {
        BookBusiness bookBusiness = new BookBusiness();
        List<Book> listBooks = bookBusinessTest.getAvalaibleBooks();
        Assert.assertEquals(listBooks.getClass(),new ArrayList<Book>().getClass());

    }

    @Test
    public void shouldReturnBookIntoAList()
    {
        Book bookCompare = new Book();
        Assert.assertEquals(bookCompare.getClass(),bookBusinessTest.getAvalaibleBooks().get(0).getClass());
    }


    @Test
    public void shouldReturnAListWithBooks()
    {

        Assert.assertThat(bookBusinessTest.getAvalaibleBooks().size(),is(not(0)));
    }

    @Test
    public void checkoutABook() {
        Assert.assertTrue(bookBusinessTest.checkOutBook("Silmarilion"));
    }

    @Test
    public void checkInABook() {
        Assert.assertTrue(bookBusinessTest.checkInBook("Silmarilion"));
    }

    @Test
    public void shouldNotReturnAListOfAvalaibleBooks() {
        BookBusiness bookBusiness = new BookBusiness();
        List<Book> booksBeforeCheckout = bookBusiness.getAvalaibleBooks().subList(0,bookBusiness.getAvalaibleBooks().size());
        boolean checkoutSucesfull =  bookBusiness.checkOutBook("LotR:Fellowship of the Ring");

        Assert.assertNotEquals(booksBeforeCheckout,bookBusinessTest.getAvalaibleBooks());
    }

}
