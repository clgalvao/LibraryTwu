package com.twu.biblioteca;
import com.twu.model.Book;
import com.twu.business.*;
import java.util.ArrayList;

public class BibliotecaApp {

    private BookBusiness bookBusiness = new BookBusiness();

    private String leftAlignFormat = "| %-30s | %-18s | %-5s |%n";


    public String selectMenuOption(String option) {

        switch (option)
        {
            case "1":
             return  showBooks();
            default:
              return  "Select a valid option!";
        }
    }




    public  String showWelcomeMessage() {
        return "Welcome To TWU Library";
    }

    public String showMenu() {
        return "|       Main Menu      |\n"
                +"========================\n"
                +"|   1 - LIST BOOKS     |\n"
                +"|   2 - CHECKOUT BOOK  |\n"
                +"|   10 - QUIT          |\n"
                +"========================";


    }

    protected String showBooks()
    {
        ArrayList<Book> bookList = bookBusiness.seedBooks();
        String books ="";

        books +="+--------------------------------+--------------------+-------+\n";
        books +="| CATALOG                        | AUTHOR             | YEAR  |\n";
        books +="+--------------------------------+--------------------+-------+\n";
        for (Book bk : bookList) {
           books += String.format(leftAlignFormat,bk.title,bk.author,bk.year);

        }
        books += "+--------------------------------+--------------------+-------+\n";
        return books;
    }


}
