package com.company.preferance.main;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.apache.log4j.Logger;


class Game {
    private static Logger logger = Logger.getLogger(Game.class.getName()); //TODO настройка вывода в файл (log4j)

    private int gameType ;
    private int round;
    private int countPlayers;
    private final List<Player> players = new ArrayList<>();

    public void newGame() {

        new Game();
        System.out.println("Добро пожаловать!");
        logger.info("Игра запущена");

        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Пожалуйста введите количество игроков (от 2 до 3): ");

            while (!in.hasNextInt()) {
                System.out.println("Прошу ввести корректное количество игроков!");
                in.next();
            }

            countPlayers = in.nextInt();
        } while ( countPlayers < 2 || countPlayers > 3);

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
            counts--;
        } while (counts > 0);
        logger.info("Игроки созданы.");

        // Создаем колоду
        Deck deck = new Deck();
        deck.shuffle();
        for (int i = 0; i < 32; i++) {
            System.out.println(deck.getDeck().get(i).getSuit() + " " + deck.getDeck().get(i).getRank());
        }

        // создаем козырную карту
        Card Trump = new Card();  //
        // узнаем какая масть козырная
        System.out.println("Trump = " + Trump.getSuit().toString());

        // берем две карты из колоды для каждого игрока 5 раз (10 карт на игрока).
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < countPlayers; i++) {
                players.get(i).setHand(new Hand(2, deck));
            }
        }
        // раунд начался
        round++;

        // 1 круг
        for (int i = 0; i < countPlayers - 1; i++) {
            Card card1 = players.get(i).getHand().getCard(0);
            System.out.println(card1.getSuit().toString() + " " + card1.getRank().toString());
            Card card2 = players.get(i).getHand().getCard(0);
            System.out.println(card2.getSuit().toString() + " " + card2.getRank().toString());
        }

    }

    public int getRound() {
        return round;
    }
    public int getGameType() {
        return gameType;
    }

    public int getCountPlayers() {
        return countPlayers;
    }
    public List<Player> getPlayers() {
        return players;
    }

    private static void endGame() {
        // TODO
    }


}
