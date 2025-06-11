package org.example;

import net.datafaker.Faker;

//ამოცანა 6 – BankAccount კლასი:
//შექმენი BankAccount კლასი სადაც შენახული იქნება მომხმარებლის ბალანსი.
//საწყისი ბალანსი იყოს Faker-ით გენერირებული.
//დაამატე ლიმიტის შემოწმების ლოგიკა — მაგალითად,
//თუ ბალანსი ნაკლებია ვიდრე 100, დაბეჭდოს „ბალანსი დაბალია“.

public class BankAccount {
    String fullName;
    double userBalance;
    Faker faker = new Faker();

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.generateUserName();
        bankAccount.generateUserBalance();
        bankAccount.checkUserBalance();
    }


    public void generateUserName() {
        fullName = faker.name().fullName();
    }

    public void generateUserBalance() {
        userBalance = faker.number().randomDouble(2, 0, 20000);
    }


    public void checkUserBalance() {
        if (userBalance < 100) {
            System.out.println("Hello, " + fullName + ". Your balance is - "
                    + userBalance + "GEL and it's less than 100GEL");
        } else {
            System.out.println("Hello, " + fullName + ".Your balance is - " + userBalance + "GEL");
        }
    }

}

