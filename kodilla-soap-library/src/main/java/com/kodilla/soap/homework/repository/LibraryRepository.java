package com.kodilla.soap.homework.repository;


import com.kodilla.courses.soap.Book;
import com.kodilla.courses.soap.Genre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class LibraryRepository {
    private static final Map<String, Book> books = new HashMap<>();

    @PostConstruct
    public void initData() {
        Book scifi = new Book();
        scifi.setSignature("b1");
        scifi.setTitle("Alien");
        scifi.setAuthor("Ridley Scott");
        scifi.setYear(1979);
        scifi.setGenre(Genre.SCI_FI);

        books.put(scifi.getSignature(), scifi);

        Book fantasy = new Book();
        fantasy.setSignature("b2");
        fantasy.setTitle("Neverending Story");
        fantasy.setAuthor("Wolfgang Petersen");
        fantasy.setYear(1984);
        fantasy.setGenre(Genre.FANTASY);

        books.put(fantasy.getSignature(), fantasy);

        Book tech = new Book();
        tech.setSignature("b3");
        tech.setTitle("Terminator 2: Judgment Day");
        tech.setAuthor("James Cameron");
        tech.setYear(1991);
        tech.setGenre(Genre.TECH);

        books.put(tech.getSignature(), tech);

        Book crime = new Book();
        crime.setSignature("b4");
        crime.setTitle("Baskerville Dog");
        crime.setAuthor("Brian Mills");
        crime.setYear(1988);
        crime.setGenre(Genre.CRIME);

        books.put(crime.getSignature(), crime);
    }

    public Book findBook(String signature) {
        Assert.notNull(signature, "You have to specify book signature");
        return books.get(signature);
    }
}
