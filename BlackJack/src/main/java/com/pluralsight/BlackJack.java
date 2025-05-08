package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        deck.shuffle();

        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine();

        List<player> players = new ArrayList<>();

        for (int i = 1; i <= numPlayers; i++) {
            System.out.print("Enter name for player " + i + ": ");
            String name = scanner.nextLine();
            players.add(new player(name));
        }


        for (player player : players) {
            player.addCard(deck.dealCard());
            player.addCard(deck.dealCard());
            player.showHand();
        }


        player winner = null;
        int bestScore = 0;

        for (player player : players) {
            int score = player.getScore();
            if (score <= 21 && score > bestScore) {
                bestScore = score;
                winner = player;
            }
        }

        if (winner != null) {
            System.out.println("\nWinner is " + winner.getName() + " with score: " + winner.getScore());
        } else {
            System.out.println("\nNo winner, all players busted!");
        }
    }
}

