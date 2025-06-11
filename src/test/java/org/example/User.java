package org.example;
//ამოცანა 2 – User კლასი და Constructor Overloading:
//შექმენი User კლასი ორი კონსტრუქტორით:
// ➤ პირველი მიიღებს მხოლოდ name
// ➤ მეორე მიიღებს name და email
//ორივე კონსტრუქტორი გამოიყენოს Faker ბიბლიოთეკა მონაცემების შევსებისთვის.

public class User {

     String name;
     String email;


    //constructor
    public User(String name) {
        this.name = name;
    }

    //constructor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void printUserInfo(String name) {
        System.out.println("Hello, you name is: " + name);
    }

    public void printUserInfo(String name, String email) {
        System.out.println("Hello, your name is: " + name + ",and your email is " + email);
    }


}
