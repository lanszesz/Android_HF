package com.example.hf3_2;

public class Product {
    String productCode;
    String productName;
    Double productPrice;
    private static int count = 0;
    private int id;

    public Product(String productCode, String productName, Double productPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
        id = count++;
    }

    @Override
    public String toString() {
        return "\n" + id + ". Code: " + productCode +
                " Name: " + productName +
                " Price: " + productPrice;
    }
}