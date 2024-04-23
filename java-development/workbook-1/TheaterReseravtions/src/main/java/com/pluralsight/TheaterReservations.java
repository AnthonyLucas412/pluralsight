package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        String fullname = myscanner.nextLine().trim();

        int indexofspace = fullname.indexOf(" ");
        String firstName = fullname.substring(0, indexofspace);
        String lastName = fullname.substring(indexofspace + 1);




        System.out.print("Date of the show (MM/dd/yyyy): ");
        String showdate = myscanner.nextLine().trim();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(showdate, formatter);


        System.out.print("How many tickets would you like?: ");
        int ticketamount = myscanner.nextInt();

        String ticketString =  ticketamount ==1 ? " ticket" : "tickets";

        System.out.println(ticketamount + " tickets reserved for " + date + " under "+ lastName + ", " + firstName);





    }
}
