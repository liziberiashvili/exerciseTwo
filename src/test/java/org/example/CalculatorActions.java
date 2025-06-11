package org.example;

import net.datafaker.Faker;

public class CalculatorActions {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Calculator calculator = new Calculator();
        int x = faker.random().nextInt();
        int y = faker.random().nextInt();
        int z = faker.random().nextInt();

        //ორ რიცხვზე გამრავლება:
        int result = calculator.multiply(x, y);
        System.out.println(result);

        //სამ რიცხვზე გამრავლება:
        result = calculator.multiply(x, y, z);
        System.out.println(result);
    }
}
