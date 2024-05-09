package com.pluralsight;

import javax.naming.Name;

public class Main {


    public static void main (String[] args){

        String prefix = "Mr";
        String firstname = "Anthony";
        String middlename = "Andre";
        String lastname = "Lucas";
        String suffix = "II";
        String fullname = "Anthony Lucas";

        String name1 = NameFormatter.format(prefix, firstname, middlename, lastname, suffix);
        System.out.println(name1);

        String name2 = NameFormatter.format(firstname,lastname);
        System.out.println(name2);

        String name3 = NameFormatter.format(fullname, firstname,lastname);
        System.out.println(name3);

    }
}
