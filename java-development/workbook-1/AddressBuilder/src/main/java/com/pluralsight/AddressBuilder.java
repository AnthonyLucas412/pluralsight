package com.pluralsight;


import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String fullname = myscanner.nextLine().trim();
        System.out.print("Enter Billing Street: ");
        String billingstreet = myscanner.nextLine().trim();
        System.out.print("Enter Billing City: ");
        String billingcity = myscanner.nextLine().trim();
        System.out.print("Enter Billing State: ");
        String billingstate = myscanner.nextLine().trim();
        System.out.print("Billing Zip code: ");
        String billingzip = myscanner.nextLine().trim();


        System.out.print("Shipping Street: " );
        String shippingstreet = myscanner.nextLine().trim();
        System.out.print("Shipping City: ");
        String shippingcity = myscanner.nextLine().trim();
        System.out.print("Shipping State: ");
        String shippingstate = myscanner.nextLine().trim();
        System.out.print("Shipping Zip: ");
        String shippingzip = myscanner.nextLine().trim();

        StringBuilder potatoBuild = new StringBuilder();
        potatoBuild.append(fullname).append("\n\n");

        potatoBuild.append("Billing Address:\n");
        potatoBuild.append(billingstreet).append("\n");
        potatoBuild.append(billingcity).append(", ");
        potatoBuild.append(billingstate).append(" ");
        potatoBuild.append(billingzip).append("\n\n");

        potatoBuild.append("Shipping Address:\n");
        potatoBuild.append(shippingstreet).append("\n");
        potatoBuild.append(shippingcity).append(", ");
        potatoBuild.append(shippingstate).append(" ");
        potatoBuild.append(shippingzip).append("\n");



    }
}
