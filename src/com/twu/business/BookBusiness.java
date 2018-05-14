package com.twu.business;
import com.twu.interfaces.IBookActions;
import com.twu.model.Book;
import java.util.ArrayList;
import java.util.HashMap;

public class BookBusiness implements IBookActions {
    public HashMap<String,Book> seedBooks()
    {
        HashMap<String,Book> bookList = new HashMap<>();
        bookList.put("1",new Book(1,"LotR:Fellowship of the Ring","J.R.R Tolkien", "1954",true));
        bookList.put("2",new Book(2,"The Hobbit","J.R.R Tolkien", "1937",true));
        bookList.put("3",new Book(3,"Silmarilion","J.R.R Tolkien", "1977",false));

        return bookList;
    }


    public boolean checkOutBook(String id) {
        HashMap<String,Book> booksStore = seedBooks();
        if (seedBooks().get(id).available)
        {
           Book checkOutBook =  booksStore.get(id);
           checkOutBook.available = false;
           booksStore.put(id,checkOutBook);
            return true;
        }

       return false;
    }


    public boolean checkInBook(String id) {
        HashMap<String,Book> booksStore = seedBooks();
        if (!seedBooks().get(id).available)
        {
            Book checkOutBook =  booksStore.get(id);
            checkOutBook.available = true;
            booksStore.put(id,checkOutBook);
            return true;
        }
        return true;
    }
}
