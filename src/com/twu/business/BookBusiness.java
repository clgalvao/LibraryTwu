package com.twu.business;


import com.twu.interfaces.IBookActions;
import com.twu.model.Book;

import java.util.ArrayList;

public class BookBusiness implements IBookActions {
    public ArrayList<Book> seedBooks()
    {
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book());
        return bookList;
    }
}
