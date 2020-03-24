package org.example.logdesign.v2;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ConsoleAppenderTest {

    @Test
    public void writeLog() throws IOException {
        ConsoleAppender consoleAppender = ConsoleAppender.getInstance();
        consoleAppender.writeLog("hello console test");
    }
}