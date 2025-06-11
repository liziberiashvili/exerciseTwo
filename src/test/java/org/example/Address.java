package org.example;
import net.datafaker.Faker;

//ამოცანა 8 – Address კლასი და User-ში კომპოზიცია:
//შექმენი Address კლასი, სადაც იქნება მისამართის დეტალები.
//შემდეგ User კლასში დაამატე Address როგორც ველი.
//ორივე კლასი გამოიყენოს Faker-ის address() მეთოდი ველების შესავსებად.

public class Address {
    protected String country;
    protected String city;
    protected String streetAddress;

    //constructor
    public Address(String country,String city,String streetAddress){
        this.country = country;
        this.city = city;
        this.streetAddress = streetAddress;

    }


    public String generateAddress(){
        Faker faker = new Faker();
        country = faker.address().country();
        city = faker.address().city();
        streetAddress = faker.address().streetAddress();

        return country + ", " + city + ", " + streetAddress;
    }

}
