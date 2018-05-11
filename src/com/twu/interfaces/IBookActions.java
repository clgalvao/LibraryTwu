package com.twu.interfaces;

import com.twu.model.Book;

import java.util.ArrayList;

public interface IBookActions {

    ArrayList<Book> seedBooks();

    boolean checkOutBook(int id);
}
