package org.example;

import net.datafaker.Faker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//ამოცანა 9 – Student.equals() მეთოდი:
//შექმენი Student კლასი სადაც თითოეულ სტუდენტს ექნება studentId.
//გადაფარე equals() მეთოდი ისე, რომ შედარება ხდებოდეს მხოლოდ studentId-ით.
//ID გენერირდეს Faker-ის საშუალებით.

public class Teacher {
    ArrayList<String> teacherID = new ArrayList<>();
    ArrayList<String> teacherNames = new ArrayList<>();
    Map<String, String> teacherInfo = new HashMap<>();
    Faker faker = new Faker();

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.generateTeacherID(teacher.teacherID);
        teacher.generateTeacherNames(teacher.teacherNames);
        System.out.println(teacher.checkTeacherIDItems(teacher.teacherID, teacher.teacherInfo));
    }

    public void generateTeacherID(ArrayList<String> teacherID) {
        int i = 0;
        while (i < 5) {


            this.teacherID = teacherID;
            String stringTeacherID = faker.idNumber().valid();
            i++;
            teacherID.add(stringTeacherID);

        }
        System.out.println(teacherID);


    }

    public void generateTeacherNames(ArrayList<String> teacherNames) {
        int j = 0;
        while (j < 5) {
            this.teacherNames = teacherNames;
            String namesString = faker.name().firstName();
            teacherNames.add(namesString);
            j++;


        }
        System.out.println(teacherNames);
    }

    public Map<String, String> checkTeacherIDItems(ArrayList<String> teacherID, Map<String, String> teacherInfo) {
        this.teacherID = teacherID;
        this.teacherInfo = teacherInfo;
        for (int i = 0; i < teacherID.size(); i++) {
            for (int j = i + 1; j < teacherID.size(); j++)
                if (teacherID.get(i).equals(teacherID.get(j))) {
                    System.out.println("Duplicate item is: " + teacherID.get(i));
                } else {
                    for (int z = 0; z < teacherID.size(); z++) {
                        teacherInfo.put(teacherNames.get(z), teacherID.get(z));
                    }
                }

        }
        return teacherInfo;
    }
}
