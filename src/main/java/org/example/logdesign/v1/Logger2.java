package org.example.logdesign.v1;

import org.apache.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class Logger2 {
    private FileWriter fileWriter;
    private static final Logger2 instance = new Logger2();

    public Logger2() {
        try {
            this.fileWriter = new FileWriter("hello.log", true);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Logger2 getInstance(){
        return instance;
    }

    public void debug(String msg) throws Exception{
        DateFormat dateFormat = DateFormat.getInstance();
        String datetime = dateFormat.format(new Date());
        fileWriter.write("[DEBUG] ");
        fileWriter.write(datetime + msg);
        fileWriter.write("\r\n");
        fileWriter.flush();
    }

    private void writeToFile(){

    }

    public void info(String info) throws Exception{

    }

    public void error(String strError) throws Exception{

    }


    public static void main(String[] args) throws Exception{
        Logger2 logger = Logger2.getInstance();
        logger.debug("hello");
    }
}
