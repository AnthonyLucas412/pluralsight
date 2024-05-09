package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome Player 1 please enter name: ");
        String firstnameplayer1 = scanner.nextLine();

        System.out.println("Welcome Player 2 please enter name: ");
        String firstnameplayer2 = scanner.nextLine();
        System.out.println();

        Player player1= new Player(firstnameplayer1);
        System.out.print("Player 1 : ");
        System.out.println(player1.getFirstname());


        Player player2 = new Player(firstnameplayer2);
        System.out.print("Player 2: ");
        System.out.println(player2.getFirstname());

        Deck deck = new Deck();
        deck.shuffle();

        Hand player1Hand = new Hand();
        player1Hand.deal(deck.deal());
        player1Hand.deal(deck.deal());

        System.out.println(player1Hand + "s hand");



    }
}
