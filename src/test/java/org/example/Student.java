package org.example;
//ამოცანა 3 – Student კლასი და getter/setter მეთოდები:
//შექმენი ინკაპსულირებული კლასი სახელით Student ველებით:
//name, age, grade. ყველა ველი იყოს private და მისაწვდომი მხოლოდ getter/setter მეთოდების საშუალებით.
//გამოიყენე Faker მონაცემების შევსებისთვის.

public class Student {
    private String name;
    private int age;
    private int grade;


    //constructor
    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setGrade(int newGrade) {
        grade = newGrade;
    }

}



