package com.pluralsight;

import java.util.Scanner;

public class CellphoneApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Cellphone cellphone1 = new Cellphone();
        Cellphone cellphone2 = new Cellphone();
        Cellphone cellphone3 = new Cellphone();

        //*Cellphone1
        System.out.println("Enter information for cellphone 1:");

        System.out.println("What is the serial number? ");
        int serialNum = myScanner.nextInt();
        cellphone1.setSerialnumber(serialNum);
        myScanner.nextLine();

        System.out.println("What is the model? ");
        String model = myScanner.nextLine();
        cellphone1.setModel(model);

        System.out.println("Who is the carrier? ");
        String carrier = myScanner.nextLine();
        cellphone1.setCarrier(carrier);

        System.out.println("What is the phone number? ");
        String phonenumber = myScanner.nextLine();
        cellphone1.setPhoneNumber(phonenumber);

        System.out.println("Who is the owner? ");
        String owner = myScanner.nextLine();
        cellphone1.setOwner(owner);



        //*cellphone2
        System.out.println("Enter information for cellphone 2:");
        System.out.println("What is the serial number? ");
        serialNum = myScanner.nextInt();
        cellphone2.setSerialnumber(serialNum);
        myScanner.nextLine();


        System.out.println("What is the model? ");
         model = myScanner.nextLine();
        cellphone2.setModel(model);

        System.out.println("Who is the carrier? ");
         carrier = myScanner.nextLine();
        cellphone2.setCarrier(carrier);

        System.out.println("What is the phone number? ");
         phonenumber = myScanner.nextLine();
        cellphone2.setPhoneNumber(phonenumber);

        System.out.println("Who is the owner? ");
         owner = myScanner.nextLine();
        cellphone2.setOwner(owner);


        //*Cellphone3
        System.out.println("Enter information for cellphone 3:");
        System.out.println("What is the serial number? ");
        serialNum = myScanner.nextInt();
        cellphone3.setSerialnumber(serialNum);
        myScanner.nextLine();


        System.out.println("What is the model? ");
        model = myScanner.nextLine();
        cellphone3.setModel(model);

        System.out.println("Who is the carrier? ");
        carrier = myScanner.nextLine();
        cellphone3.setCarrier(carrier);

        System.out.println("What is the phone number? ");
        phonenumber = myScanner.nextLine();
        cellphone3.setPhoneNumber(phonenumber);

        System.out.println("Who is the owner? ");
         owner = myScanner.nextLine();
        cellphone3.setOwner(owner);


        myScanner.close();

        display(cellphone1);
        display(cellphone2);
        display(cellphone3);

        cellphone1.dial(cellphone2.getPhoneNumber());
        cellphone2.dial(cellphone1.getPhoneNumber());
        cellphone1.dial(cellphone3.getPhoneNumber());
    }

public static void display(Cellphone cellphone){
        System.out.println("\nCellPhone Details:");
        System.out.println("Serial Number: " + cellphone.getSerialnumber());
        System.out.println("Model: " + cellphone.getModel());
        System.out.println("Carrier: " + cellphone.getCarrier());
        System.out.println("Phone Number: " + cellphone.getPhoneNumber());
        System.out.println("Owner: " + cellphone.getOwner());

    }

}
