package com.framework.driver;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;

abstract public class DriverManager {
    public static void setup() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 60000;
        Configuration.timeout = 10000;
        Configuration.headless = false;
        Configuration.browserCapabilities = new ChromeOptions()
                .addArguments("--disable-gpu", "--disable-extensions", "--disable-popup-blocking");

    }
}
