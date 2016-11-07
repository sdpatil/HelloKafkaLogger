package com.spnotes.kafka;


import org.apache.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.Log4jLoggerFactory;

/**
 * Created by sunilpatil on 11/7/16.
 */
public class HelloKafkaLogger {
    private static final Logger logger = LoggerFactory.getLogger(HelloKafkaLogger.class);

    public static void main(String[] argv){
        System.out.println("Inside HelloKafkaLogger.main");

        for(int i = 10 ;i < 20; i++){
            logger.warn("Debug message from HelloKafkaLogger.main " + i);
        }
        try {
            Thread.sleep(1000);
        }catch (Exception ex){

        }
        System.out.println("Exiting HelloKafkaLogger.main");
        LogManager.shutdown();
    }
}
