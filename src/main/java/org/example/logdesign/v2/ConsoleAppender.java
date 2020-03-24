package org.example.logdesign.v2;

import java.io.IOException;

public class ConsoleAppender extends Appender {

    public static ConsoleAppender instance = new ConsoleAppender();

    public static ConsoleAppender getInstance(){
        return instance;
    }

    @Override
    public void writeLog(String msg) throws IOException {
        String formatStr = this.formatMsg(msg);
        System.out.println(formatStr);
    }
}
