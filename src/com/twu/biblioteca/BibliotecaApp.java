package com.twu.biblioteca;
import com.twu.model.Book;
import com.twu.business.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BibliotecaApp {

    private BookBusiness bookBusiness = new BookBusiness();

    private String leftAlignFormat = "|%-5s| %-30s | %-18s | %-5s |%n";


    public String selectMenuOption(String option) {

        switch (option)
        {
            case "1":
                return  showBooks();
            case "2":
                return checkoutBook();
            case "3":
                return checkInBook();
            case "10":
                return "Bye!";
            default:
                return  "Select a valid option!";
        }
    }

    public String checkoutBook()
    {
        System.out.println(showBooks());
        Scanner keyboard = new Scanner(System.in);

        return bookBusiness.checkOutBook(keyboard.next()) ? "Thank you! Enjoy the book":"That book is not available!";
    }

    public String checkInBook()
    {
        System.out.println(showBooks());
        Scanner keyboard = new Scanner(System.in);

        return bookBusiness.checkInBook(keyboard.next()) ? "Thank you for returning the book.":"That is not a valid book to return.";
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
        HashMap<String,Book> bookList = bookBusiness.seedBooks();
        String books ="";

        books +="+-----+--------------------------------+--------------------+-------+\n";
        books +="| ID  | CATALOG                        | AUTHOR             | YEAR  |\n";
        books +="+-----+--------------------------------+--------------------+-------+\n";
        for (Book bk : bookList.values()) {
           books += String.format(leftAlignFormat,bk.id,bk.title,bk.author,bk.year);

        }
        books += "+-----+--------------------------------+--------------------+-------+\n";
        return books;
    }


}
