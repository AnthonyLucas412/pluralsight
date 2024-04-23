package com.pluralsight;

public class main {

    public static void main(String[] args) {
        String name = "Anthony";
        int age = 35;
        double price = 25.00;

       /* if (age < 18) {
            price = 18;
        } else if (age < 65) {
            price = 25;
        } else {
            price = 20;
        }*/



        if (age < 18 || age >= 65) {
            price = 18;
        } else {
            price = 25;
        }


        System.out.println("Price of admission: " + price);
    }
}