package org.example;

import net.datafaker.Faker;

public class UserActions {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String name = faker.name().firstName();
        String email = faker.internet().emailAddress();
        User user = new User(name);
        user.printUserInfo(name);
        User user1 = new User(name, email);
        user1.printUserInfo(name, email);



    }
}
