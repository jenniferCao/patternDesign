package org.example.logdesign.v1;

import sun.rmi.runtime.Log;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    String time;
    String info;
    File file;

    private File createFile(String fileName){
        file =  new File(fileName);
        return file;
    }

    private String findDateTime(){
        DateFormat dateFormat = DateFormat.getDateTimeInstance();
        String value = dateFormat.format(new Date());
        return value;
    }

    public void debug(String message){
        //ctrl-alt-t 添加异常快捷键
        try {
            OutputStream outputStream = new FileOutputStream("test.log", true);
            String out = this.findDateTime() + ": " + message + "\r";
            outputStream.write(out.getBytes());
            outputStream.flush();
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }

    //采用buffer io
    public void debugWriter(String message){
        try {
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("test.log", true));
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            String out = this.findDateTime() + ": " + message + "\r";
            bufferedWriter.write(out);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }

    //采用buffer io
    public void debugOutputStreamWriter(String message){
        try {
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("test.log", true));
            String out = this.findDateTime() + ": " + message + "\r";
            writer.write(out);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }

    public static void main(String[] args) {
        Logger logger = new Logger();
//        logger.createFile("test.log");
//        logger.debugWriter("hello");
        logger.debugOutputStreamWriter("test 123");
    }
}
