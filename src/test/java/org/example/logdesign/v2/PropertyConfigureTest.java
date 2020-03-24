package org.example.logdesign.v2;

import org.apache.log4j.helpers.Loader;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class PropertyConfigureTest {

    @Test
    public void parseProperites() throws IOException {
        PropertyConfigure configure = PropertyConfigure.getInstance();
        Properties props = configure.parseProperties();
        Enumeration enumeration = props.keys();
        while (enumeration.hasMoreElements()){
            String key = (String) enumeration.nextElement();
            System.out.println(key+ "=" + props.get(key));
        }
    }

    @Test
    public void testParseProperitesByFileName() throws Exception {
        PropertyConfigure configure = new PropertyConfigure();
        Properties props = configure.parseProperitesByFileName("log4j.properties");
        Enumeration enumeration = props.keys();
        while (enumeration.hasMoreElements()){
            String key = (String) enumeration.nextElement();
            System.out.println(key+ "=" + props.get(key));
        }
    }

    @Test
    public void testParsePropertiesByPath() throws IOException{
        String filePath = "./log4j.properties";
        PropertyConfigure propertyConfigure = PropertyConfigure.getInstance();
        propertyConfigure.parsePropertiesByPath(filePath);
    }
}