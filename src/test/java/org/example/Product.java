package org.example;

import net.datafaker.Faker;

public class Product {
    double productPrice;
    int discount;
    Faker faker = new Faker();

    public static void main(String[] args) {
        Product product = new Product();

        double originalPrice = product.generateProductPrice();
        int discountPercentage = product.generateDiscountPercentage();
        double result = product.applyDiscount();

        System.out.println("Original price is: " + originalPrice + "GEL");
        System.out.println("Applied discount is: " + discountPercentage + "%");
        System.out.println("Discounted price is: " + result + "GEL");
    }

    public double generateProductPrice() {
        String price = faker.commerce().price();
        productPrice = Double.parseDouble(price);
        return productPrice;
    }

    public int generateDiscountPercentage() {
        discount = faker.random().nextInt(1, 100);
        return discount;
    }


    public double applyDiscount() {
        double discountedPrice =  productPrice * discount / 100;
        return productPrice - discountedPrice;

    }
}


