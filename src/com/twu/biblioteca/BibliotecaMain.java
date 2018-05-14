package com.twu.biblioteca;
import java.io.*;
import java.util.Scanner;

import com.twu.*;

public class BibliotecaMain {
    public static BibliotecaApp bookApp = new BibliotecaApp();



    public static void main(String[] args) throws IOException {

        menuControl();

    }


    public static void menuControl() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String comand = "";
        System.out.println(bookApp.showWelcomeMessage());
        System.out.println(bookApp.showMenu());
        while (!comand.equals("10"))
        {
           comand = keyboard.next().toString();
           System.out.println(bookApp.selectMenuOption(comand));
           System.out.println(bookApp.showMenu());
        }
    }
}
