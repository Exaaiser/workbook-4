package com.pluralsight;

public class card {
    private String suit;
    private String rank;

    public card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public int getValue() {
        if ("JQK".contains(rank)) return 10;
        if ("A".equals(rank)) return 11;
        return Integer.parseInt(rank);
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
