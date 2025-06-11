package org.example;

import net.datafaker.Faker;

public class Person extends Address{
    protected String address;
    protected String buildingNumber;
    Faker faker = new Faker();

    //constructor
    public Person(String country, String city, String streetAddress, String buildingNumber)
    {
        super(country, city, streetAddress);
        this.address = generateAddress();
        this.buildingNumber = buildingNumber;

    }

    public void generateBuildingNumber(){
        buildingNumber = faker.address().buildingNumber();

    }


    public String generateFullAddress(){
        return "Full address is: " + address + ", " + buildingNumber;
    }




}
