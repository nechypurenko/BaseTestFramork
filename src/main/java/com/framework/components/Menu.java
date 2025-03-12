package com.framework.components;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.framework.actions.Action.clickElement;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class Menu {
    private final SelenideElement parentDropdownElement = $(".dropdown");
    private final SelenideElement categoryBtnElement = $("button.flex-group.dropdown__toggle.button-reset");
    private final ElementsCollection categoriesMenuElements = $$("div.categories-menu ul li");
    private final ElementsCollection subCategoriesMenuElements = $$("div.categories-menu-section ul li");

    public void selectCategory(String name) {
        clickElement(categoryBtnElement);
        SelenideElement categoryElement = categoriesMenuElements
                .findBy(text(name));
        clickElement(categoryElement);
    }

    public void selectSubCategory(String name) {
        SelenideElement subCategoryElement = subCategoriesMenuElements
                .findBy(text(name));
        clickElement(subCategoryElement);
    }
}
