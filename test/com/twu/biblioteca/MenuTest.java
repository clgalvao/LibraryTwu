package com.twu.biblioteca;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;


public class MenuTest {
    @Test
    public void welcomeMessage()
    {
        Assert.assertEquals("Welcome To TWU Library",BibliotecaApp.showWelcomeMessage());
    }

    @Test
    public void showMenu()
    {
        Assert.assertEquals( "|       Main Menu      |\n"
                                      +"========================\n"
                                      +"|   1 - LIST BOOKS     |\n"
                                      +"========================",BibliotecaApp.showMenu());
    }


    @Test
    public void shouldReturnAListOfBooks()
    {
        ArrayList<Book> bookCompare = new ArrayList();
        bookCompare.add(new Book());

        Assert.assertEquals(bookCompare.getClass(),BibliotecaApp.showBooks().getClass());
    }

    @Test
    public void shouldReturnBookIntoAList()
    {
        Book bookCompare = new Book();
        Assert.assertEquals(bookCompare.getClass(),BibliotecaApp.showBooks().get(0).getClass());
    }


    @Test
    public void shouldReturnAListWithBooks()
    {
        ArrayList<Book> bookCompare = new ArrayList();
        bookCompare.add(new Book());
        bookCompare.add(new Book());
        Assert.assertEquals(bookCompare.size() != 0,BibliotecaApp.showBooks().size() != 0);
    }



}
