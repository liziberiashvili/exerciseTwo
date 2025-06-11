package org.example;

import net.datafaker.Faker;


public class BookActions {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String title = faker.book().title();
        String author = faker.book().author();
        int pages = faker.number().numberBetween(1, 800);
        String genre = faker.book().genre();
        BookInfo bookInfo = new BookInfo(title, author, pages, genre);
        String bookInformation = bookInfo.toString();
        System.out.println(bookInformation);
    }





}
