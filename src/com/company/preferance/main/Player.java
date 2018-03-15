package com.company.preferance.main;

import java.util.ArrayList;

class Player {
    // state
    private final String name;


    private ArrayList<Card> hand = new ArrayList<>();
    private Integer pool = 0;
    private Integer mount = 0;
    private Integer vists = 0;

    Player(String name) {
        this.name = name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public Integer getPool() {
        return pool;
    }

    public void setPool(Integer pool) {
        this.pool = pool;
    }

    public Integer getMount() {
        return mount;
    }

    public void setMount(Integer mount) {
        this.mount = mount;
    }

    public Integer getVists() {
        return vists;
    }

    public void setVists(Integer vists) {
        this.vists = vists;
    }
    //TODO убрать отображение какие карты берутся из колоды.
    public void createHand(int count, Deck deck) {
        for (int j = 0; j < count; j++) {
            Card card = deck.getTopCard();
            System.out.println("Карта " + card.getSuit() + " " + card.getRank() + " взята из колоды.");
            hand.add(card);
            System.out.println("Карта " + card.getSuit() + " " + card.getRank() + " добавлена.");
        }
    }
}
