package org.example.logdesign.v2;

import org.apache.log4j.helpers.Loader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class PropertyConfigure {
    private String fileName;

    public static final String LOG_FILE ="log4j.properties";

    public static final PropertyConfigure instance = new PropertyConfigure();

    public static PropertyConfigure getInstance(){
        return instance;
    }

    public PropertyConfigure() {
        this(LOG_FILE);
    }

    private PropertyConfigure(String fileName) {
        this.fileName = fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Properties parseProperties() throws IOException{
        ClassLoader classLoader = Loader.class.getClassLoader();
        URL url = classLoader.getResource(this.fileName);
        Properties properties = new Properties();
        properties.load(url.openStream());
        return properties;
    }

    public Properties parseProperitesByFileName(String fileName) throws IOException {
        this.setFileName(fileName);
        return this.parseProperties();
    }

    public Properties parsePropertiesByPath(String filePath) throws IOException{
        FileInputStream inputStream = new FileInputStream(fileName);
        return this.parseProperitesByInputStream(inputStream);
    }


    public Properties parseProperitesByInputStream(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties;
    }


}
