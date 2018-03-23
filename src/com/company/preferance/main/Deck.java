package com.company.preferance.main;

import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.Logger;

class Deck {
    private static Logger logger = Logger.getLogger(Deck.class.getName());

    private ArrayList<Card> deck;
    private int sizeOfDeck;

    Deck() {
        int lengthSuit = Suits.values().length;
        int lengthRank = Ranks.values().length;
        deck = new ArrayList<>();
        for (int i = 0; i < lengthSuit; i++) {
            for (int j = 0; j < lengthRank; j++) {
                Card card = new Card(i, j);
                deck.add(card);
                logger.info("Карта " + card.getSuit().toString() + " " + card.getRank().toString() + " добавлена в колоду");
                sizeOfDeck++;
            }
        }
        logger.info("Колода создана.");
        logger.info("Размер колоды на данный момент: " + getSizeOfDeck());
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public int getSizeOfDeck() {
        return sizeOfDeck;
    }
    // with remove
    public Card getTopCard() {
        Card card = deck.get(0);
        deck.remove(0);
        logger.info("Карта " + card.getSuit().toString() + " " + card.getRank().toString() + " взята в колоду");
        return card;
    }

    public Card getCardByIndex(int index) {
        Card card = deck.get(index);
        deck.remove(index);
        logger.info("Карта " + card.getSuit().toString() + " " + card.getRank().toString() + " взята в колоду по индексу " + index);
        return card;
    }

    //shuffled
    public void shuffle() {
        Collections.shuffle(deck);
        logger.info("Колода перемешана.");
    }
}
