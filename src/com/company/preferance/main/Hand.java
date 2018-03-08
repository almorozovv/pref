package com.company.preferance.main;

import java.util.LinkedHashSet;

class Hand {

    private LinkedHashSet<Card> cardsForHand = new LinkedHashSet<>();

    Hand(Player player, int count) {
        for (int j = 0; j < count; j++) {
            Card cardForHand = new Card();
            this.cardsForHand.add(cardForHand);
        }
    }

}
