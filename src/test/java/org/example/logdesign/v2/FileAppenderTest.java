package org.example.logdesign.v2;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FileAppenderTest {

    @Test
    public void testFileSingleInstance() {
    }

    @Test
    public void testLog() throws IOException {
        FileAppender fileAppender = new FileAppender("test.log");
        fileAppender.writeLog("hello test");
    }
}