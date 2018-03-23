package com.company.preferance.main;

public enum Suits {
    SPADES(1), CLUBS(2), DIAMONDS(3), HEARTS(4);

    private int index;

    Suits(int index) {
        this.index = index;
    }
    public int getIndex() {
        return index;
    }
}
