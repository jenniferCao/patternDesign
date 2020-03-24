package org.example.logdesign.v3;

public interface AppenderAttachable {
    public void addAppender(Appender appender);
    public Appender getRelatedAppender(String appenderName);
}
