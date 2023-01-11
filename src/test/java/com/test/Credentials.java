package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Credentials {
    protected Object readProperties(Object property) {
        Properties props = new Properties();
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("./globalProps.properties");
            props.load(fileInputStream);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return props.get(property);
    }
}
