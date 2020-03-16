package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    List<Book> books = new ArrayList<>();

    public Book bookManager(String title, String author) {
        return new Book(title, author);
    }

    public List<Book> createBookList(Book book) {
        if (!books.contains(book))
            books.add(book);
        return books;
    }
}