package com.twu.biblioteca;
import com.twu.model.Book;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println(showWelcomeMessage());
        System.out.println(showMenu());



    }

    public static String showWelcomeMessage() {
        return "Welcome To TWU Library";
    }

    public static String showMenu() {
        return   "|       Main Menu      |\n"
                +"========================\n"
                +"|   1 - LIST BOOKS     |\n"
                +"========================";


    }

    public static String showBooks()
    {
        
        return "" ;
    }


}
