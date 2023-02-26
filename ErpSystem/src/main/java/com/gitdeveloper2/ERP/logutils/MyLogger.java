package com.gitdeveloper2.ERP.logutils;



import java.util.Random;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Logger;

public class MyLogger {

    public Logger createLogger() {
        Random rand = new Random();
        Logger logger = Logger.getLogger("myLogger" + rand.nextInt());

        ConsoleHandler handler = new ConsoleHandler();

        Formatter formatter = new LogFormatter();
        handler.setFormatter(formatter);
        logger.setUseParentHandlers(false);

        logger.addHandler(handler);
        return logger;
    }

}
