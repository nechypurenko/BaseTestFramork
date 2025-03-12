package com.tests;

import com.codeborne.selenide.Selenide;
import com.framework.driver.DriverManager;
import com.framework.utils.ConfigReader;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import static com.codeborne.selenide.Selenide.open;

abstract public class BaseTest {

    public final static String BASE_URL =  ConfigReader.get("base.url");
    @BeforeTest
    public static void setup() {
        DriverManager.setup();
        open(BASE_URL);
    }

    @AfterTest
    public static void tearDown() {
        Selenide.closeWebDriver();
    }
}
