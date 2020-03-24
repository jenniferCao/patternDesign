package org.example.logdesign.v2;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class AppenderFactoryTest {
    @Test
    public void createAppenderSingle() throws IOException {
        AppenderFactory appenderFactory = new AppenderFactory();
        FileAppender appender = appenderFactory.getInstance("hello.log");
        appender.writeLog("hello 33333");
    }
}