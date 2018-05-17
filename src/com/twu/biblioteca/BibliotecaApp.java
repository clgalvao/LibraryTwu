package com.twu.biblioteca;
import com.twu.model.Book;
import com.twu.business.*;
import com.twu.model.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp
{

    private BookBusiness bookBusiness = new BookBusiness();
    private MovieBusiness movieBusiness = new MovieBusiness();

    private String leftAlignFormatBook = "|%-5s| %-30s | %-18s | %-5s |%n";
    private String leftAlignFormatMovie = "|%-5s| %-30s | %-18s | %-5s | %-2s  |%n";


    public String selectMenuOption(String option)
    {

        switch (option)
        {
            case "1":
                return showBooks();
            case "2":
                return checkoutBook();
            case "3":
                return checkInBook();
            case "4":
                return showMovies();
            case"5":
                return checkoutMovie();
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



    public String checkoutMovie()
    {
        System.out.println("Which movie you want to CheckOut?");
        System.out.println(showMovies());

        return movieBusiness.checkoutMovie(choseControl()) ? "Thank you! Enjoy the Movie":"Something Happen Try Again.";
    }

    protected String showMovies() {
        List<Movie> movieList = movieBusiness.getAvailableMovies();
        String movies ="";

        movies +="+-----+--------------------------------+--------------------+-------+-----+\n";
        movies +="| ID  | MOVIE                          | DIRECTOR           | YEAR  | RATE|\n";
        movies +="+-----+--------------------------------+--------------------+-------+------\n";
        for (Movie mv : movieList) {
            movies += String.format(leftAlignFormatMovie,mv.id,mv.name,mv.director,mv.year,Integer.toString(mv.rating));

        }
        movies += "+-----+--------------------------------+--------------------+-------+-----+\n";
        return movies;

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


    public String showWelcomeMessage()
    {
        return "Welcome To TWU Library";
    }

    public String showMenu()
    {
        return "|       Main Menu      |\n"
                +"========================\n"
                +"|   1 - LIST BOOKS     |\n"
                +"|   2 - CHECKOUT BOOK  |\n"
                +"|   3 - CHECK-IN BOOK  |\n"
                +"|   4 - CHECKOUT MOVIE |\n"
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
           books += String.format(leftAlignFormatBook,bk.id,bk.title,bk.author,bk.year);

        }
        books += "+-----+--------------------------------+--------------------+-------+\n";
        return books;
    }


}
