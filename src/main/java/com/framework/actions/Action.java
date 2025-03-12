package com.framework.actions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Action {

    public static void clickElement(SelenideElement element) {
        element.shouldBe(Condition.visible)
                .shouldBe(Condition.enabled)
                .click();
    }

    public static boolean findHeadingByText(String text) {
        SelenideElement heading = $$("h1, h2, h3, h4, h5, h6")
                .findBy(text(text));
        return heading.isDisplayed();
    }
}
