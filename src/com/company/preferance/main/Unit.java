package com.company.preferance.main;

import com.company.preferance.main.Card;
import com.company.preferance.main.Deck;

// for test
class Unit {

    public static void main(String[] args) {

        Deck testDeck = new Deck();

        for (int i = 0; i < 32; i++) {
            Card oneCard = testDeck.getDeck().get(i);
            System.out.println(oneCard.getRank() + ' ' + oneCard.getSuit());


        }

        testDeck.shuffle();
        System.out.println("____________MAGIC!!!______________________");

        for (int i = 0; i < 32; i++) {
            Card oneCard = testDeck.getDeck().get(i);
            System.out.println(oneCard.getRank() + ' ' + oneCard.getSuit());

        }


    }


}
