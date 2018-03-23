package com.company.preferance.main;

import java.util.Random;
import org.apache.log4j.Logger;

public class Card {

    private static Logger logger = Logger.getLogger(Card.class.getName());

    private final Ranks rank;
    private final Suits suit;

    public Card(Ranks rank, Suits suit) {
        this.rank = rank;
        this.suit = suit;
        logger.info("Карта создана: " + getSuit().toString() + " " + getRank().toString());
    }

    public Card(int indexSuit, int indexRank) {
        if (indexSuit > (Suits.values().length - 1) || indexSuit <= -1)
            throw new IllegalArgumentException("Illegal playing card suit");
        if (indexRank > (Ranks.values().length - 1) || indexRank <= -1)
            throw new IllegalArgumentException("Illegal playing card rank");
        this.rank = Ranks.values()[indexRank];
        this.suit = Suits.values()[indexSuit];
        logger.info("Карта создана: " + getSuit().toString() + " " + getRank().toString());
    }
    public Card() {
        Random random = new Random();
        this.rank = Ranks.values()[random.nextInt(Ranks.values().length)];
        this.suit = Suits.values()[random.nextInt(Suits.values().length)];
        logger.info("Карта создана: " + getSuit().toString() + " " + getRank().toString());
    }

    public Ranks getRank() {
        return rank;
    }

    public Suits getSuit() {
        return suit;
    }

}
