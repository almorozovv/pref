package com.company.preferance.main;

public class Game {

    public static void main(String[] args) {

        // создаем игроков
        Player bot1 = new Player("Sam");
        Player bot2 = new Player("Bob");
        Player bot3 = new Player("Mike");
        Dealer bot4 = new Dealer("Joe");

        // создаем козырную карту
        Card Trump = new Card();  //
        // узнаем какая масть козырная
        System.out.println("Trump = " + Trump.getSuit());
        // прикуп
        //Hand talon = new Hand();  // TO-DO

        Hand bot1Hand = new Hand(bot1, 2);
        Hand bot2Hand = new Hand(bot2, 2);
        Hand bot3Hand = new Hand(bot3, 2);
        Hand bot4Hand = new Hand(bot4, 2);



    }
}
