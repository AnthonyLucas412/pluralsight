package com.pluralsight;

public class NameFormatter {
    private String prefix;
    private String firstname;
    private String middlename;
    private String lastname;
    private String suffix;

    public String getFirstname() {
        return firstname;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSuffix() {
        return suffix;
    }

    private NameFormatter(String prefix, String firstname, String lastname, String middlename, String suffix) {
        this.prefix = prefix;
        this.firstname = firstname;
        this.lastname = lastname;
        this.middlename = middlename;
        this.suffix = suffix;


    }
    public static String format (String firstname, String lastname){

        return firstname + " " + lastname;
    }


    public static String format (String prefix, String firstname, String middlename , String lastname, String suffix){
        return prefix + " " + firstname + " " + middlename + " " + lastname + " " + suffix;
    }
public static String format (String fullname, String firstname, String lastname){
        return fullname ;
}

}

