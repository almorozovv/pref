package com.company.preferance.main;

public class Rules {

    //private String trump; //козырь
    private String rule;  //правило



    public void createTrump() {
        Card cardForTrump = new Card();
        System.out.println("Trumps suit is " + cardForTrump.getSuit());
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

}
