package com.twu.biblioteca;
import com.twu.model.Book;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class BibliotecaAppTest {
    private BibliotecaApp bibliotecaApp = new BibliotecaApp();

    @Test
    public void welcomeMessage()
    {
        Assert.assertEquals("Welcome To TWU Library", bibliotecaApp.showWelcomeMessage());
    }

    @Test
    public void showMenuClient()
    {
        Assert.assertEquals( "|       Main Menu      |\n"
                                      +"========================\n"
                                      +"|   1 - LIST BOOKS     |\n"
                                      +"|   2 - CHECKOUT BOOK  |\n"
                                      +"|   3 - CHECK-IN BOOK  |\n"
                                      +"|   10 - QUIT          |\n"
                                      +"========================", bibliotecaApp.showMenu());
    }

    @Test
    public void menuWrongOption()
    {
        Assert.assertEquals("Select a valid option!", bibliotecaApp.selectMenuOption(""));
    }

    @Test
    public void menuListBooksOption()
    {
        ArrayList<Book> bookCompare = new ArrayList();
        bookCompare.add(new Book(1,"LotR:Fellowship of the Ring","J.R.R Tolkien", "1954",false));

        Assert.assertTrue(bibliotecaApp.selectMenuOption("1").contains(bookCompare.get(0).author));
    }


}
