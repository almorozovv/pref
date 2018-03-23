package com.company.preferance.main;

import org.apache.log4j.Logger;

class Dealer extends Player {
    private static Logger logger = Logger.getLogger(Dealer.class.getName());


    public Dealer(String name) {
        super(name);
        logger.info("Дилер создан.");
    }


}
