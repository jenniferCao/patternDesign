package org.example.logdesign.v1;

import java.security.PublicKey;

public class Level {
    public static final Integer INFO = 1;
    public static final Integer DEBUG = 2;
    public static final Integer ERROR = 3;

    private String leveStr;
    private Integer level;

    public Level(String leveStr, Integer level) {
        this.leveStr = leveStr;
        this.level = level;
    }
}
