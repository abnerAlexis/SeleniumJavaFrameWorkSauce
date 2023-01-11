package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTests {
    protected WebDriver driver = new ChromeDriver();
    private Properties props;

    private void readProperties() {
        if (props != null) {
            return ;
        }

        props = new Properties();
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("./globalProps.properties");
            props.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected Object getPropertyValue(String property) {
        readProperties();
        return props.get(property);
    }

    @BeforeClass
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
    }

//    @AfterClass
//    public void tearDown() {
//        driver.close();
//    }
}
