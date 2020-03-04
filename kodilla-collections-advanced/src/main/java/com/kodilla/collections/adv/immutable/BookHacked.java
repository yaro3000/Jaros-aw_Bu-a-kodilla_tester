package com.kodilla.collections.adv.immutable;

public class BookHacked extends Book {
    private String realTitle;

    public BookHacked(String author, String title) {
        super(author, title);
    }

    public void modifyTitle(String newTitle) {
        realTitle = newTitle;
    }

    @Override
    public String getTitle() {
        return realTitle;
    }
}
