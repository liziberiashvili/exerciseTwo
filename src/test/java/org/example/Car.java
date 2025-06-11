package org.example;

import net.datafaker.Faker;

//ამოცანა 1 – Car კლასი:
//შექმენი კლასი Car შემდეგი ველებით:brand,model,year.
// გამოიყენე Faker ბიბლიოთეკა იმისთვის, რომ შემთხვევითად შევსო ეს ველები
// (მაგ. მანქანის ბრენდი, მოდელი და წელი). დაამატე მეთოდი printInfo(),
// რომელიც დაბეჭდავს მანქანის დეტალურ ინფორმაციას.

public class Car {
   String brand;
   String model;
   int year;

    public static void main(String[] args) {
        Car car = new Car();
        car.generateCarInfo();
        car.printCarInfo();
    }

    public void generateCarInfo(){
        Faker faker = new Faker();
        this.brand = faker.vehicle().make();
        this.model = faker.vehicle().model();
        this.year = faker.number().numberBetween(2020, 2025);
    }


    public void printCarInfo(){
        System.out.println("Brand name is - " + brand);
        System.out.println("Model name is - " + model);
        System.out.println("Year is - " + year);
    }
}

