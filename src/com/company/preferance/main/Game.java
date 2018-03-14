package com.company.preferance.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private int countPlayers;
    private String playerName;
    private ArrayList<String> playersNames;

    public void startGame() {
        Game game = new Game();
        System.out.println("Добро пожаловать!");

        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Пожалуйста введите количество игроков (от 1 до 3): ");

            while (!in.hasNextInt()) {
                System.out.println("Прошу ввести корректное количество игроков!");
                in.next();
            }

            countPlayers = in.nextInt();
        } while ( countPlayers < 0 || countPlayers > 3);

        int countName = countPlayers;

        do {
            System.out.println("Отлично! А теперь скажите как их зовут?");

            while (!in.hasNext()) {
                System.out.println("Прошу введите имя!");
                in.next();
            }

            playerName = in.next();
            playersNames.add(playerName);
            System.out.println("Привет, " + playerName + "Отличное имя!");
            countName--;
        } while (playerName == null && countName > 0);




        //TODO создаем игроков
        //for (int i = 0; i < countPlayers; i++) {
        // Player bot(тут вписать i) = new Player(тут имя из playersNames);
        //}


        // Создаем колоду
        Deck deck = new Deck();
        deck.shuffle();

        // создаем козырную карту
        Card Trump = new Card();  //
        // узнаем какая масть козырная
        System.out.println("Trump = " + Trump.getSuit());

    }

    // TODO необходимо переделать.
//        bot1.createHand(2, deck);
//        bot2.createHand(2, deck);
//        bot3.createHand(2, deck);

        // прикуп TODO


        // если пулька одного из игроков 10, то игра должна закончиться (просто пример)
//        if (bot1.getPool() == 10 || bot2.getPool() == 10 || bot3.getPool() == 10) {
//            game.endGame();
//        }
//
//
//    }

    private static void endGame() {
        // TODO
    }


}
