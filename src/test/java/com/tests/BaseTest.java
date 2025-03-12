package com.tests;

import com.codeborne.selenide.Selenide;
import com.framework.driver.DriverManager;
import com.framework.pages.HomePage;
import com.framework.pages.UnixPage;
import com.framework.utils.TestDataUtil;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

abstract public class BaseTest {

    public final static String BASE_URL= "https://www.tutorialspoint.com/index.htm";
    @BeforeTest
    public static void setup() {
        DriverManager.setup();
    }

    @AfterTest
    public static void tearDown() {
        Selenide.closeWebDriver();
    }
}
