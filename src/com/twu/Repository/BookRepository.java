package com.twu.Repository;

import java.util.ArrayList;
import java.util.List;
import com.twu.model.Book;

public class BookRepository {

    public BookRepository() {
    }

    public static List<Book> bookList = new ArrayList<>();


    public Book findBookByName(String name) {
        Book lookingBook = new Book();
        for (int i = 0; i < getBooks().size(); i++)
        {
            if(getBooks().get(i).title.equals(name))
                lookingBook = getBooks().get(i);
        }
        return lookingBook;
    }
    public boolean checkOutBook(String name) {
        List<Book> booksStore = getBooks();
        if (findBookByName(name).available)
        {
            Book checkOutBook =findBookByName(name);
            checkOutBook.available = false;
            booksStore.remove(booksStore.indexOf(checkOutBook));
            booksStore.add(checkOutBook);
            return true;
        }

        return false;
    }


    public boolean checkInBook(String name) {
        List<Book> booksStore = getBooks();
        if (!findBookByName(name).available)
        {
            Book checkOutBook =findBookByName(name);
            checkOutBook.available = true;
            booksStore.remove(booksStore.indexOf(checkOutBook));
            booksStore.add(checkOutBook);
            return true;
        }
        return false;
    }


    public List<Book> getBooks() {

        if((bookList.size() == 0)) {
            bookList = new ArrayList<>();
            bookList.add(new Book(1, "LotR:Fellowship of the Ring", "J.R.R Tolkien", "1954", true));
            bookList.add(new Book(2, "The Hobbit", "J.R.R Tolkien", "1937", true));
            bookList.add(new Book(3, "Silmarilion", "J.R.R Tolkien", "1977", true));

            return bookList;
        }
        return bookList;
    }


    public List<Book> getAvalaibleBooks() {
       List<Book> booksAvaleible = new ArrayList<>();
        for (int i = 0; i < getBooks().size(); i++)
        {
            if(getBooks().get(i).available)
                booksAvaleible.add(getBooks().get(i));
        }
        return booksAvaleible;
    }
}
