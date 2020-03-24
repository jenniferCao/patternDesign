package org.example.logdesign.v3;

import org.apache.log4j.helpers.Loader;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ClassPathResource implements Resource {
    private String name;
    private InputStream inputStream;

    public void loadResrouce(String fileName) throws IOException {
        this.name = fileName;
        ClassLoader classLoader = Loader.class.getClassLoader();
        URL url = classLoader.getResource(fileName);
        this.inputStream = url.openStream();
    }


    @Override
    public InputStream getInputStream() {
        return this.inputStream;
    }
}
