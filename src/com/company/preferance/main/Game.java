package com.company.preferance.main;


import java.util.ArrayList;
import java.util.Scanner;


public class Game {

    private int round;
    private int countPlayers;
    private ArrayList<Player> players = new ArrayList<>();

    public void newGame() {
        new Game();
        System.out.println("Добро пожаловать!");

        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Пожалуйста введите количество игроков (от 1 до 3): ");

            while (!in.hasNextInt()) {
                System.out.println("Прошу ввести корректное количество игроков!");
                in.next();
            }

            countPlayers = in.nextInt();
        } while ( countPlayers < 0 || countPlayers > 3);

        int countName = countPlayers;
        String playerName;

        do {
            System.out.print("Отлично! Пожалуйста введите имя игрока: ");

            in.nextLine();
            // TODO необходимо контроль ввода данных пользователя
            playerName = in.next();

            //создаем игроков
            players.add(new Player(playerName));
            System.out.println("Привет, " + playerName + ". Отличное имя!");
            countName--;
        } while (countName > 0);

        // Создаем колоду
        Deck deck = new Deck();
        deck.shuffle();
        for (int i = 0; i < 32; i++) {
            System.out.println(deck.getDeck().get(i).getSuit() + " " + deck.getDeck().get(i).getRank());
        }

        // создаем козырную карту
        Card Trump = new Card();  //
        // узнаем какая масть козырная
        System.out.println("Trump = " + Trump.getSuit());

        // берем две карты из колоды для каждого игрока
        for (int i = 0; i < countPlayers; i++) {
            players.get(i).createHand(2,deck);
        }

    }



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
