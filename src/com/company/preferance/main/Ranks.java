package com.company.preferance.main;

public enum Ranks {

    SEVEN(0), EIGHT(1), NINE(2), TEN(3), JACK(4), QUEEN(5), KING(6), ACE(7);

    private int index;

    Ranks(int index) {
        this.index = index;
    }
    public int getIndex() {
        return index;
    }
}
