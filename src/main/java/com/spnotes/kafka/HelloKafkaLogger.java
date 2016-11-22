package com.spnotes.kafka;


import org.apache.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sunilpatil on 11/7/16.
 */
public class HelloKafkaLogger {
    private static final Logger logger = LoggerFactory.getLogger(HelloKafkaLogger.class);

    public static void main(String[] argv) {
        System.out.println("Inside HelloKafkaLogger.main");


            logger.debug("Debug message from HelloKafkaLogger.main," );
            logger.info("Info message from HelloKafkaLogger.main" );
            logger.warn("Warn message from HelloKafkaLogger.main");
            logger.error("Error message from HelloKafkaLogger.main" );

        System.out.println("Exiting HelloKafkaLogger.main");
        LogManager.shutdown();
    }
}
