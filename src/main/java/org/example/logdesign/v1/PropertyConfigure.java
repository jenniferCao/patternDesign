package org.example.logdesign.v1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertyConfigure {
    public Properties doConfigure(String fileName){
        try (InputStream inputStream = new FileInputStream(fileName)) {
            Properties properties = new Properties();
            properties.load(inputStream);
            properties.propertyNames();
            return properties;
        }catch (Exception e){
            e.printStackTrace();
        }
    return null;
    }
}
