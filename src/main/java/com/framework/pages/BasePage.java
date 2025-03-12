package com.framework.pages;

import static com.codeborne.selenide.Selenide.open;

abstract public class BasePage {
    public void openPage(String url) {
        open(url);
    }}
