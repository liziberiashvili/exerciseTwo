package org.example;
//ამოცანა 4 – Calculator კლასი და მეთოდის გადატვირთვა:
//შექმენი Calculator კლასი და დაამატე ორი გადატვირთული multiply() მეთოდი:
//        ➤ ერთი ორი რიცხვისთვის
//➤ მეორე სამი რიცხვისთვის
//ყველა რიცხვი დაგენერირდეს Faker-ის გამოყენებით.


public class Calculator {

    public int multiply(int x, int y, int z) {
        return x * y * z;
    }

    public int multiply(int x, int y) {
        return x * y;
    }
}
