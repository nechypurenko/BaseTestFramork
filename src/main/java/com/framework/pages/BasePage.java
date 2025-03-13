package com.framework.pages;

import com.framework.components.Menu;

import static com.codeborne.selenide.Selenide.open;

abstract public class BasePage {
    private final Menu menu = new Menu();

    public void selectCategory(String name) {
        menu.selectCategory(name);
    }

    public void selectSubCategory(String name) {
        menu.selectSubCategory(name);
    }
}
