package com.company.preferance.main;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;


class Game {
    private static Logger logger = Logger.getLogger(Game.class.getName()); //TODO настройка вывода в файл (log4j)
    private final static int dealNumber = 5;

    private int conventions;
    private int round;
    private int countPlayers;
    private final List<Player> players = new ArrayList<>();

    public void newGame() {

        new Game();
        System.out.println("Добро пожаловать!");
        logger.info("Игра запущена");

        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Пожалуйста введите количество игроков (от 1 до 3): ");

            while (!in.hasNextInt()) {
                System.out.println("Прошу ввести корректное количество игроков!");
                in.next();
            }

            countPlayers = in.nextInt();
        } while ( countPlayers < 0 || countPlayers > 3);

        int counts = countPlayers;
        logger.info("Указано кол-во играков: " + countPlayers);
        String playerName;

        do {
            System.out.print("Отлично! Пожалуйста введите имя игрока: ");

            in.nextLine();
            // TODO необходимо контроль ввода данных пользователя
            playerName = in.next();

            //создаем игроков
            players.add(new Player(playerName));
            logger.info("Игрока зовут " + playerName);
            counts--;
        } while (counts > 0);
        logger.info("Игроки созданы");

        // Создаем колоду
        Deck deck = new Deck();
        logger.info("Колода создана");
        deck.shuffle();
        logger.info("Колода перемешана");
        for (int i = 0; i < 32; i++) {
            System.out.println(deck.getDeck().get(i).getSuit() + " " + deck.getDeck().get(i).getRank());
        }

        // создаем козырную карту
        Card Trump = new Card();  //
        // узнаем какая масть козырная
        System.out.println("Trump = " + Trump.getSuit());

        // берем две карты из колоды для каждого игрока 5 раз (10 карт на игрока)
        // TODO две карты в прикуп
        for (int j = 0; j < dealNumber; j++) {
            for (int i = 0; i < countPlayers; i++) {
                players.get(i).setHand(new Hand(2, deck));
            }
        }

        //TODO начинаем играть

    }


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
