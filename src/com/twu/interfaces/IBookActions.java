package com.twu.interfaces;

import com.twu.model.Book;

import java.util.ArrayList;
import java.util.HashMap;

public interface IBookActions {

    HashMap<String,Book> seedBooks();

    boolean checkOutBook(String id);

    boolean checkInBook(String id);
}
