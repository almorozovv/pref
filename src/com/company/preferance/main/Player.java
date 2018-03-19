package com.company.preferance.main;

import java.util.logging.Logger;

class Player {


    private static Logger logger = Logger.getLogger(Player.class.getName());
    private final String name;
    private Hand hand;



    private Integer pool = 0;
    private Integer mount = 0;
    private Integer vists = 0;

    Player(String name) {
        this.name = name;
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

}
