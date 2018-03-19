package com.company.preferance.main;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Logger;

public class Card {

    private static Logger logger = Logger.getLogger(Card.class.getName());

    private final String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};  // масти от младшей к старшей
    private final String[] ranks  = {"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};  // название карт от меньшего к большему
    private String suit;
    private String rank;

    Card() { // создание одной random карты

        this.suit = suits[new Random().nextInt(suits.length)];
        this.rank = ranks[new Random().nextInt(ranks.length)];
        logger.info("Карта создана. Масть: " + suit + ", Ранг: " + rank);
    }

    Card(int s, int r) { // создание карты c указанием какая именно должна быть
        if (s > (suits.length - 1) || s < 0)
            throw new IllegalArgumentException("Illegal playing card suit");
        if (r > (ranks.length - 1) || r < 0)
            throw new IllegalArgumentException("Illegal playing card rank");
        this.suit = suits[s];
        this.rank = ranks[r];
        logger.info("Карта создана. Масть: " + suit + ", Ранг: " + rank);
    }

    //getter and setter
    public String getSuit() {
        return suit;
    }
    public String getSuitByIndex(int s) {
        return suits[s];
    }

    public String getRank() {
        return rank;
    }
    public String getRankByIndex(int r) {
        return ranks[r];
    }

    public String[] getSuits() {
        return suits;
    }

    public String[] getRanks() {
        return ranks;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 1;
        hash = hash * prime + suit.hashCode();
        hash = hash * prime
                + (rank == null ? 0 : rank.hashCode());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Card other = (Card) obj;
        if (!(suit.equals(other.suit)))
            return false;
        if (!(rank.equals(other.rank)))
            return false;
        return true;
    }

}
