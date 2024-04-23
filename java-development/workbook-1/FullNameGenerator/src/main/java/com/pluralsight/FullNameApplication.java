package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstname = myscanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastname = myscanner.nextLine();

        System.out.print(" Enter your middle name (optional) : ");
        String middlename = myscanner.nextLine();

        System.out.print("Enter your suffix  ");
        String suffix = myscanner.nextLine();

        String fullname = firstname;

        if (!middlename.isEmpty()){
            fullname += " " + middlename + ",";
        }

        fullname += " " + lastname;

        if (!suffix.isEmpty()) {
            fullname += ", " + suffix;
        }

        System.out.println("\nfull name: " + fullname);





    }
}
