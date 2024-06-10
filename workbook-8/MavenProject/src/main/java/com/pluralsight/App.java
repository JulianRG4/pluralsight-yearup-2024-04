package com.pluralsight;

import java.util.logging.Logger;


/**
 * Hello world!
 *
 */
public class App
{
    final static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args)
    {
        logMeLikeYouDo("☕");
    }

    private static void logMeLikeYouDo(String input)
    {

        logger.trace("This is trace: " + input);
        logger.debug("This is debug : " + input);
        logger.info("This is info : " + input);
        logger.warn("This is warn : " + input);
        logger.error("This is error : " + input);
        logger.fatal("This is fatal : " + input);
    }

    private static void configureLogger()
    {
        PatternLayout layout = new PatternLayout();
        layout.setConversionPattern("%d{yyyy-mm-dd HH:mm:ss} %-5p %c{1}:%L - %m%n");

        ConsoleAppender consoleAppender = new ConstableAppender();
        consoleAppender.setLayout(Layout);
        consoleAppender.activateOptions();

        Logger rootLogger = Logger.getRootLogger();
        rootLogger.setLevel(Level.TRACE);
    }
}
