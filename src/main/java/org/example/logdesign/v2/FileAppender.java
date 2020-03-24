package org.example.logdesign.v2;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FileAppender extends Appender {
    private String filePath;
    private FileWriter fileWriter;


    public FileAppender(String filePath) throws IOException {
        this.filePath = filePath;
        FileWriter fileWriter = new FileWriter(filePath, true);
        this.setFileWriter(fileWriter);
        this.addAppender(this);
    }

    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    @Override
    public void writeLog(String msg) throws IOException {
        String formatStr = this.formatMsg(msg);
        this.fileWriter.write(formatStr);
        this.fileWriter.flush();
    }

}
