package com.company.preferance.main;

import java.util.ArrayList;
import java.util.logging.Logger;

class Hand {
    private static Logger logger = Logger.getLogger(Hand.class.getName());
    private ArrayList<Card> hand = new ArrayList<>();


    private int sizeHand;


    Hand(int count, Deck deck) {
        for (int j = 0; j < count; j++) {
            Card card = deck.getTopCard();
            logger.info("Карта " + card.getSuit() + " " + card.getRank() + " взята из колоды.");
            hand.add(card);
            logger.info("Карта " + card.getSuit() + " " + card.getRank() + " добавлена игроку");
            sizeHand++;
        }
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getSizeHand() {
        return sizeHand;
    }

    public Card getCard(int cardIndex) {
        Card card = hand.get(cardIndex);
        hand.remove(cardIndex);
        return card;
    }

}
