package com.pluralsight;

import java.util.Arrays;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        String[] colors = {"red" , "white" , "blue"};
        String[] copy = new String[3];

        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(copy));

        copy = colors;

        System.out.println("====================================");

        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(copy));

        System.out.println("=====================================");

        colors[1] = "black";

        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(copy));

    }
}






