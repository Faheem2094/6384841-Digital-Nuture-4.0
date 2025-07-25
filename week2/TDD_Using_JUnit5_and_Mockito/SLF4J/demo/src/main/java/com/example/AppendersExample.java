package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppendersExample {
    private static final Logger logger = LoggerFactory.getLogger(AppendersExample.class);

    public static void main(String[] args) {
        logger.info("This message is logged to both console and file.");
        logger.debug("Debugging message logged.");
        logger.error("An error message is logged.");
    }
}
