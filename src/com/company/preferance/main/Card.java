package com.company.preferance.main;

import java.util.Random;

public class Card {

    private String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};  // масти от младшей к старшей
    private String[] ranks  = {"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};  // название карт от большего к меньшему
    private String suit;
    private String value;

    public Card() { // создание одной карты

        this.suit = suits[new Random().nextInt(suits.length)];
        this.value = ranks[new Random().nextInt(ranks.length)];
    }

    //getter and setter
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
