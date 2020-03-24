package org.example.logdesign.v1;

public class Hello {
    private static final Logger2 logger = Logger2.getInstance();
    public void helloOne(){
        try {
            logger.debug("hello class test");
//            logger.info();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.helloOne();
    }

}
