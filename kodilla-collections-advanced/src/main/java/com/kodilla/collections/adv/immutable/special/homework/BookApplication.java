package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookApplication {
    public static void main(String[] args) {

        BookManager createBook = new BookManager();

        List<Book> books = new ArrayList<>();
        books.add(createBook.bookManager("Wiedźmin", "Andrzej Sapkowski"));
        books.add(createBook.bookManager("Pan Lodowego Ogrodu", "Jarosław Grzędowicz"));
        books.add(createBook.bookManager("Opowieści z Mekhańskiego Pogranicza", "Robert M. Wegner"));
        books.add(createBook.bookManager("Wiedźmin", "Andrzej Sapkowski"));
        books.add(createBook.bookManager("Wiedźmin", "Andrzej Sapkowski"));
        books.add(createBook.bookManager("Wiedźmin", "Andrzej Sapkowski"));
        books.add(createBook.bookManager("fsdfdsfsd", "sdfsdfsd Sapkosdfdsfsdwski"));

        for (Book book : books) {
            createBook.createBookList(book);
        }

        System.out.println(createBook.books.size());

        for (Book book : createBook.books) {
            System.out.println("Książkę " + book.getTitle() + " napisał" + " " + book.getAuthor());
        }

        System.out.println("-------");
    }
}
