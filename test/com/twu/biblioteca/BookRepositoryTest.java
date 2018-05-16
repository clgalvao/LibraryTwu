package com.twu.biblioteca;

import com.twu.Repository.BookRepository;
import org.junit.Assert;
import org.junit.Test;

public class BookRepositoryTest {
    BookRepository bookRepositoryTest = new BookRepository();
    @Test
    public void returnBookByName() {
        Assert.assertEquals("LotR:Fellowship of the Ring",bookRepositoryTest.findBookByName("LotR:Fellowship of the Ring").title);
    }
}
