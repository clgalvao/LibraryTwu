package com.twu.business;
import com.twu.Repository.BookRepository;
import com.twu.interfaces.IBookActions;
import com.twu.model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookBusiness implements IBookActions
{

    BookRepository bookRep = new BookRepository();


    public boolean checkOutBook(String name)
    {

        if (bookRep.findBookByName(name).available)
        {
            return  bookRep.checkOutBook(name);
        }

       return false;
    }


    public boolean checkInBook(String name)
    {

        if (!bookRep.findBookByName(name).available)
        {
            return bookRep.checkInBook(name);
        }
        return false;
    }




    public List<Book> getAvalaibleBooks()
    {
        return bookRep.getAvalaibleBooks();
    }

   public boolean findBookByName(String name)
   {
       return bookRep.findBookByName(name).title == null;
   }
}
