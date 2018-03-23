package com.company.preferance.main;

import org.apache.log4j.Logger;

class Player {


    private static Logger logger = Logger.getLogger(Player.class.getName());
    private final String name;
    private Hand hand;

    private Integer pool = 0;
    private Integer mount = 0;
    private Integer vists = 0;

    Player(String name) {
        this.name = name;
        logger.info("Игрок " + name +" создан.");
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Integer getPool() {
        return pool;
    }

    public void setPool(Integer pool) {
        this.pool = pool;
        logger.info("Изменена пулька на " + pool + " для игрока: " + getName());
    }

    public Integer getMount() {
        return mount;
    }

    public void setMount(Integer mount) {
        this.mount = mount;
        logger.info("Изменена гора на " + mount + " для игрока: " + getName());
    }

    public Integer getVists() {
        return vists;
    }

    public void setVists(Integer vists) {
        this.vists = vists;
        logger.info("Изменены висты на " + mount + " для игрока: " + getName());
    }

}
