package org.example.logdesign.v2;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Appender {
    public List<Appender> appenders = new ArrayList<>();
    public List<Appender> addAppender(Appender appender){
        appenders.add(appender);
        return appenders;
    }

    public abstract void writeLog(String msg) throws IOException;

    public String formatMsg(String msg){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        String dateStr = simpleDateFormat.format(new Date());
        String formatStr = dateStr + "  " + msg + "\r\n";
        return formatStr;
    }
}
