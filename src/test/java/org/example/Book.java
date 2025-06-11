package org.example;
//ამოცანა 5 – Book კლასი და toString():
//შექმენი Book კლასი ველებით: title, author, pages.
//გამოიყენე Faker-ის book() მეთოდი ამ ველების შესავსებად.
//override გააკეთე toString() მეთოდზე და დააბრუნე წიგნის მოკლე აღწერა.

public class Book {
    protected String title;
    protected String author;
    protected int pages;

    //constructor
    public Book(String title, String author, int pages) {

        this.title = title;
        this.author = author;
        this.pages = pages;
    }


    public String toString() {
        return "Book - " + title + ", Author - " + author + ", Pages - " + pages;
    }

}

