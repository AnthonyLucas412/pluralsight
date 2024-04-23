package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        try{
            
        String[] quotes = {
                "Be yourself everyone else is already taken",

                "So many books so little time",

                "Two things are infinite the universe and human stupidity and I'm not sure about the universe",

                "A room without books is like a body without a soul",

                "You know you're in love when you can't fall asleep because reality is finally better than your dreams",

                "You only live once, but if you do it right, once is enough",

                "Be the change that you wish to see in the world",

                "To live is the rarest thing in the world. Most people exist, that is all",

                "If you tell the truth, you don't have to remember anything",

                "A friend is someone who knows all about you and still loves you"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pick a quote (select from #1 - #10) : ");
        int input = scanner.nextInt();

        System.out.println(quotes[input - 1]);
    }catch (Exception ex){

        System.out.println("your number is out of range!");
    }

    }
}
