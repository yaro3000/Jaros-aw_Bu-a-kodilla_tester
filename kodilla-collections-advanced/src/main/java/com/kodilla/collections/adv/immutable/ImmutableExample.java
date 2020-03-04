package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        Book book = new BookHacked("John Steward", "The Last Chance");
        BookHacked bookHacked = (BookHacked) book;
        bookHacked.modifyTitle("New title");
        System.out.println(book.getTitle());
    }
}
