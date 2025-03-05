package com.ezzahi;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        System.out.println("hello wrold");
        logger.debug("Ceci est un message de debug");
        logger.info("Ceci est un message d'information");
        logger.error("Ceci est un message d'erreur");
    }
}