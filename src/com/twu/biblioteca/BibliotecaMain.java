package com.twu.biblioteca;
import java.io.*;
import java.util.Scanner;

import com.twu.*;

public class BibliotecaMain {
    public static BibliotecaApp bookApp = new BibliotecaApp();



    public static void main(String[] args) {

        menuControl();

    }


    public static void menuControl()
    {
        Scanner keyboard = new Scanner(System.in);
        String comand = "";
        System.out.println(bookApp.showWelcomeMessage());
        System.out.println(bookApp.showMenu());
        while (comand != "10")
        {
           comand = keyboard.next();
            System.out.println(bookApp.selectMenuOption(comand));
        }
    }
}
