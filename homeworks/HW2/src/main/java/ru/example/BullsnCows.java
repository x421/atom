package ru.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class BullsnCows {
	final Logger log = (Logger) LogManager.getLogger()
    //private static final org.slf4j.Logger log = LoggerFactory.getLogger(BullsnCows.class);

    public static void main(String[] args) {
        log.info("Логгер работает!");
        System.out.println("BullsnCows");
    }

    public static int forTest() {
        return 9000;
    }
}
