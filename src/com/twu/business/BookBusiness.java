package com.twu.business;


import com.twu.interfaces.IBookActions;
import com.twu.model.Book;

import java.util.ArrayList;

public class BookBusiness implements IBookActions {
    public ArrayList<Book> seedBooks()
    {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("LotR:Fellowship of the Ring","J.R.R Tolkien", "1954"));
        bookList.add(new Book("The Hobbit","J.R.R Tolkien", "1937"));
        bookList.add(new Book("Silmarilion","J.R.R Tolkien", "1977"));

        return bookList;
    }


    public boolean checkOutBook(int id) {
        
        return true;
    }
}
