package com.twu.biblioteca;
import com.twu.business.*;
import com.twu.model.Book;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;


public class BookTest {

    private BookBusiness bookBusinessTest = new BookBusiness();

    @Test
    public void shouldReturnAListOfBooks()
    {
        ArrayList<Book> bookCompare = new ArrayList();
        bookCompare.add(new Book());

        Assert.assertEquals(bookCompare.getClass(),bookBusinessTest.seedBooks().getClass());
    }

    @Test
    public void shouldReturnBookIntoAList()
    {
        Book bookCompare = new Book();
        Assert.assertEquals(bookCompare.getClass(),bookBusinessTest.seedBooks().get(0).getClass());
    }


    @Test
    public void shouldReturnAListWithBooks()
    {
        ArrayList<Book> bookCompare = new ArrayList();
        bookCompare.add(new Book());
        bookCompare.add(new Book());
        Assert.assertThat(bookBusinessTest.seedBooks().size(),is(not(0)));
    }

}
