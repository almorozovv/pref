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
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    // with remove
    public Card removeTopCard(int i) {
        Card card = deck.get(i);
        deck.remove(i);
        return card;
    }

    //shuffled
    public void shuffle() {
        Collections.shuffle(deck);
        System.out.println("Deck is shuffled");
    }
}
