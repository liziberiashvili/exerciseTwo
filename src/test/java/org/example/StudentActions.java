package org.example;

import net.datafaker.Faker;



public class StudentActions {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String name = faker.funnyName().name();
        int age = faker.number().numberBetween(17, 30);
        int grade = faker.number().numberBetween(0,100);
        Student student = new Student(name, age, grade);
        student.setName(name);
        student.setAge(age);
        student.setGrade(grade);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGrade());
    }
}
