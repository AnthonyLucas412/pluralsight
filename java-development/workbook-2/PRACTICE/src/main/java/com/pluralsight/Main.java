package com.pluralsight;

/*public class Main {
    public static void main(String[] args) {
        /*for (int j = 0; j < 20; j++) {
            System.out.println("For loop: " + j);

        /*int k = 3;
        while (k < 14) {
            System.out.println("While loop: " + k);

           k++;*/

        /*int m = 0;
        do {
            System.out.println("Do-while loop: " + m);
            m++;
        } while (m < 10);*/

        /*int[] myArray = new int[10];
        myArray[0] = 5;*/

        public class Student {
            String name;
            int age;

            // Constructor
            public Student(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public void display() {
                System.out.println("Name: " + this.name);
                System.out.println("Age: " + this.age);
            }

            public static void main(String[] args) {
                Student student = new Student("John", 20);
                student.display();
            }
        }


