package org.example.logdesign.v2;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AppenderFactory {
    private Map<String, FileAppender> fileAppenders = new ConcurrentHashMap<>();

    public FileAppender getInstance(String name) throws IOException {
        FileAppender appender = this.fileAppenders.get(name);
        if (appender == null){
            synchronized (this){
                appender = new FileAppender(name);
                this.fileAppenders.put(name, appender);
            }
        }
        return appender;

    }
}
