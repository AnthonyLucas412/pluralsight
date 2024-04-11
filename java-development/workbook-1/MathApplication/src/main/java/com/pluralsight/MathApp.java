package com.pluralsight;

import java.sql.SQLOutput;

public class MathApp {
    public static void main(String[] args) {
     double bobsalary= 50_000;
      double garysalary= 60_000;
      double highestSalary = Math.max(bobsalary , garysalary);
        System.out.println("The highest Salary is " + highestSalary);

        double carPrice = 20000.0;
        double truckPrice = 18000.0;
        double minprice = Math.min(carPrice , truckPrice);
        System.out.println("The smallest price is " + minprice);

        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + area);

        double num1 = 5.0;
        double sqrtNum1 = Math.sqrt(num1);
        System.out.println(" The square root of " + num1 + " is " + sqrtNum1);

        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2 - y1,2));
        System.out.println("The distance between the points is " + distance);
    }
}
