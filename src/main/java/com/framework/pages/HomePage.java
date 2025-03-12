package com.framework.pages;

import com.framework.components.Menu;

public class HomePage extends BasePage {
    private final Menu menu = new Menu();

    public void selectCategory(String name) {
        menu.selectCategory(name);
    }

    public void selectSubCategory(String name) {
        menu.selectSubCategory(name);
    }
}
