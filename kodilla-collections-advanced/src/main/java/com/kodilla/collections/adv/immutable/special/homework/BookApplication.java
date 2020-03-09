package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookApplication {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        Book book1 = new BookManager().bookManager("Wiedźmin", "Andrzej Sapkowski");
        Book book2 = new BookManager().bookManager("Pan Lodowego Ogrodu", "Jarosław Grzędowicz");
        Book book3 = new BookManager().bookManager("Opowieści z Mekhańskiego Pogranicza", "Robert M. Wegner");
        Book book4 = new BookManager().bookManager("Wiedźmin", "Andrzej Sapkowski");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        System.out.println(books.size());

        for (Book book : books) {
            System.out.println("Książkę " + book.getTitle() + " napisał" + " " + book.getAuthor());
        }

        System.out.println("-------");
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book4.hashCode());
        System.out.println(book1 == book2);
        System.out.println(book1 == book3);
        System.out.println(book2 == book3);
    }
}
