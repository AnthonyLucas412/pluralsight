package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class BedtimeStories {
    public static void main(String[] args) {
        /*try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name of story: ");
            String filename = scanner.nextLine();

            FileInputStream fis = new FileInputStream(filename);
            Scanner filescanner = new Scanner(fis);

            int lineNumber = 1;



            while (filescanner.hasNextLine()) {
                String line  = filescanner.nextLine();
                System.out.println(lineNumber + " ," + line);
            }
            scanner.close();
            filescanner.close();

        } catch (Exception e) {
            System.out.println("An error has occurred!");*/

            try {
                FileReader fileReader = new FileReader("poem.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line;

                while((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
                bufferedReader.close();


            } catch (Exception e) {
                System.out.println("An error has occured!");



            }


        }
    }

