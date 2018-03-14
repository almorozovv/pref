package com.company.preferance.main;

import java.util.Random;

public class Card {

    private final String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};  // масти от младшей к старшей
    private final String[] ranks  = {"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};  // название карт от большего к меньшему
    private String suit;
    private String rank;

    Card() { // создание одной random карты

        this.suit = suits[new Random().nextInt(suits.length)];
        this.rank = ranks[new Random().nextInt(ranks.length)];
    }

    Card(int s, int r) { // создание карты c указанием какая именно должна быть
        if (s > (suits.length - 1) || s < 0)
            throw new IllegalArgumentException("Illegal playing card suit");
        if (r > (ranks.length - 1) || r < 0)
            throw new IllegalArgumentException("Illegal playing card rank");
        this.suit = suits[s];
        this.rank = ranks[r];
    }

    //getter and setter
    public String getSuit() {
        return suit;
    }
    public String getSuitByIndex(int s) {
        return suits[s];
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }
    public String getRankByIndex(int r) {
        return ranks[r];
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String[] getSuits() {
        return suits;
    }

    public String[] getRanks() {
        return ranks;
    }

}
