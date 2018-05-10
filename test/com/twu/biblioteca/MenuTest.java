package com.twu.biblioteca;
import com.twu.model.Book;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;


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





}
