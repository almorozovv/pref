package com.company.preferance.main;

import java.util.ArrayList;
import java.util.Collections;

class Deck {

    private ArrayList<Card> deck;
    final private int size = 32;

    Deck() {
        deck = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                deck.add(new Card(i, j));
            }
        }
        System.out.println("Колода создана.");
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    // with remove
    public Card getTopCard() {
        Card card = deck.get(0);
        deck.remove(0);
        return card;
    }

    //shuffled
    public void shuffle() {
        Collections.shuffle(deck);
        System.out.println("Колода перемешана.");
    }
}
