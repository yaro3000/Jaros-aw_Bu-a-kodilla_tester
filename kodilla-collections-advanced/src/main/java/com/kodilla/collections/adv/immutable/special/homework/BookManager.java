package com.kodilla.collections.adv.immutable.special.homework;

import java.util.LinkedList;
import java.util.List;

public class BookManager {

   List<Book> bookList = new LinkedList<>();

    public Book bookManager(String title, String author) {
        Book book = new Book(title, author);
        createBookList(book);
        return book;
    }

    public List<Book> createBookList(Book book) {
        if(!bookList.contains(book));
        bookList.add(book);
        return bookList;
    }
}


