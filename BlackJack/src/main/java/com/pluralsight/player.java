package com.pluralsight;

import java.util.*;

public class player {
    private String name;
    private List<card> hand;

    public player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void addCard(card card) {
        hand.add(card);
    }

    public int getScore() {
        int score = 0;
        int aceCount = 0;
        for (card card : hand) {
            score += card.getValue();
            if (card.getRank().equals("A")) aceCount++;
        }
        // Ace değeri ayarı (11 yerine 1 gerekirse)
        while (score > 21 && aceCount > 0) {
            score -= 10;
            aceCount--;
        }
        return score;
    }

    public String getName() {
        return name;
    }

    public List<card> getHand() {
        return hand;
    }

    public void showHand() {
        System.out.println(name + "'s hand: " + hand + " | Score: " + getScore());
    }
}

