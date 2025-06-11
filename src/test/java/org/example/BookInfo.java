package org.example;



public class BookInfo extends Book {
    protected String genre;

    //constructor
    public BookInfo(String title, String author, int pages, String genre) {
        super(title, author, pages);
        this.genre = genre;
    }


    @Override
    public String toString(){
        return "Book - " + title + ", Author - " + author + ", Pages - " + pages + ", Genre - " + genre;
    }

}
