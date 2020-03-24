package org.example.logdesign.v1;

import org.apache.log4j.Logger;
public class Log4jTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Log4jTest.class);
        logger.debug("hello");
    }
}
