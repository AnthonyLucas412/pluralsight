package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /*LocalDate date = LocalDate.now();

        System.out.println("day of the week: " + date.getDayOfWeek());
        System.out.println("day of the month: " + date.getDayOfMonth());
        System.out.println(" day of year: " + date.getDayOfYear());

        System.out.println(" month name: " + date.getMonth());
        System.out.println(" month value: "+ date.getMonthValue());
        System.out.println(" year: " + date.getYear());

        System.out.println("======================================================");

        LocalTime time = LocalTime.now();
        System.out.println("hour: " + time.getHour());
        System.out.println("Minutes: " + time.getMinute());
        System.out.println("Seconds: " + time.getSecond());
        System.out.println("Nanosecond: " + time.getNano());*/

       /* LocalDateTime today  = LocalDateTime.now();
        System.out.println("today is : " + today);

        DateTimeFormatter fnt = DateTimeFormatter.ofPattern("E, MMM dd, yyyy h:mm:ss a");

        String formattedDate = today.format(fnt);

        System.out.println("The formatted date is: " + formattedDate);*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter a date: ");
        String Userinput = scanner.nextLine();

        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate transformedDate = LocalDate.parse(Userinput, dateformat);
        System.out.println(transformedDate);
    }


}
