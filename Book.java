package com.tts;

public class Book {
    String title;
    boolean borrowed;

    public Book() {
    }

    public Book(String title, boolean borrowed) {
        this.title = title;
        this.borrowed = borrowed;
    }

    public String toString() {
        return "Book{title='" + this.title + "', borrowed=" + this.borrowed + "}";
    }

    public Book(String bookTitle) {
        this.title = bookTitle;
        this.borrowed = false;
    }

    public void borrowed() {
        this.borrowed = true;
    }

    public void returned() {
        this.borrowed = false;
    }

    public boolean isBorrowed() {
        return this.borrowed;
    }

    public String getTitle() {
        return this.title;
    }



}