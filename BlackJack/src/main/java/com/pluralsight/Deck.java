package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<card> cards;

    public Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        cards = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new card(rank, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public card dealCard() {
        return cards.remove(0);
    }
}
