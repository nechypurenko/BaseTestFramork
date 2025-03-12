package com.framework.components;
import static com.codeborne.selenide.Selenide.*;
import static com.framework.actions.Action.clickElement;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class Menu {
    private final SelenideElement parentDropdown = $(".dropdown");

    public void selectCategory(String name) {
        parentDropdown.find("button").scrollTo().click();
        SelenideElement ulElement = parentDropdown
                .find("div.categories-menu ul");
        clickElement(ulElement, name);
    }

    public void selectSubCategory(String name) {
        ElementsCollection ulElements = parentDropdown
                .findAll("div.categories-menu-section ul");
        clickElement(ulElements, name);
    }
}
