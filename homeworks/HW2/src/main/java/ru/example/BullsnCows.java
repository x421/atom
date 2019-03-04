package ru.example;

import org.slf4j.LoggerFactory;

public class BullsnCows {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(BullsnCows.class);

    public static void main(String[] args) {
        log.info("Логгер работает!");
        System.out.println("BullsnCows");
    }

    public static int forTest() {
        return 9000;
    }
}
