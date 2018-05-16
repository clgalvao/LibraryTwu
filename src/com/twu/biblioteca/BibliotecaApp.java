package com.twu.biblioteca;
import com.twu.model.Book;
import com.twu.business.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    private BookBusiness bookBusiness = new BookBusiness();

    private String leftAlignFormat = "|%-5s| %-30s | %-18s | %-5s |%n";


    public String selectMenuOption(String option) {

        switch (option)
        {
            case "1":
                return showBooks();
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
        System.out.println("Which book you want to CheckOut?");
        System.out.println(showBooks());

        return bookBusiness.checkOutBook(choseControl()) ? "Thank you! Enjoy the book":"Something Happen Try Again.";
    }


    private String choseControl()
    {
        Scanner keyboard = new Scanner(System.in);
        String book = keyboard.nextLine();
        while (bookBusiness.findBookByName(book))
        {
            System.out.println("That is not a valid book to return");
            book = keyboard.nextLine();
        }

        return book;
    }

    public String checkInBook()
    {
        System.out.println("Which book you want to Check-In?");
            return bookBusiness.checkInBook(choseControl()) ? "Thank you for returning the book.":"Something Happen Try Again.";
    }


    public String showWelcomeMessage() {
        return "Welcome To TWU Library";
    }

    public String showMenu() {
        return "|       Main Menu      |\n"
                +"========================\n"
                +"|   1 - LIST BOOKS     |\n"
                +"|   2 - CHECKOUT BOOK  |\n"
                +"|   3 - CHECK-IN BOOK  |\n"
                +"|   10 - QUIT          |\n"
                +"========================";


    }



    protected String showBooks()
    {
        List<Book> bookList = bookBusiness.getAvalaibleBooks();
        String books ="";

        books +="+-----+--------------------------------+--------------------+-------+\n";
        books +="| ID  | CATALOG                        | AUTHOR             | YEAR  |\n";
        books +="+-----+--------------------------------+--------------------+-------+\n";
        for (Book bk : bookList) {
           books += String.format(leftAlignFormat,bk.id,bk.title,bk.author,bk.year);

        }
        books += "+-----+--------------------------------+--------------------+-------+\n";
        return books;
    }


}
