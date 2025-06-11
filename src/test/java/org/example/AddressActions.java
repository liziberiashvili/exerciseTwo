package org.example;


public class AddressActions {

    public static void main(String[] args) {
        Person person = new Person("", "", "", "");
        person.generateBuildingNumber();
        String fullAddress = person.generateFullAddress();
        System.out.println(fullAddress);

    }

}
