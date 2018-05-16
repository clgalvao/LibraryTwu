package com.twu.interfaces;

import com.twu.model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface IBookActions {

    boolean checkOutBook(String name);

    boolean checkInBook(String name);

    List<Book> getAvalaibleBooks();
}
