package com.framework.actions;

import java.util.Locale;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Action {

    private final static String textXpath = ".//*[contains(translate(normalize-space(text()), " +
            "'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '%s')]";

    public static void clickElement(SelenideElement parent, String name) {
        String xpath = String.format(textXpath, name);
        SelenideElement element = parent.$x(xpath);
        if (element.exists()) {
            element.scrollTo().shouldBe(Condition.enabled).click();
            System.out.println("Clicked on element with text: " + name);
        } else {
            System.out.println("Element with text '" + name + "' not found within parent.");
        }
    }

    public static void clickElement(ElementsCollection elements, String name) {
        String xpath = String.format(textXpath, name);
        boolean isClicked = false;
        for (SelenideElement element : elements) {
            SelenideElement findElement = element.$x(xpath);
            if (findElement.exists()) {
                findElement.shouldBe(Condition.visible)
                        .shouldBe(Condition.enabled)
                        .scrollTo()
                        .click();
                System.out.println("Clicked on element: " + name);
                isClicked = true;
                break;
            }
        }
        if (!isClicked) {
            System.out.println("Element '" + name + "' not found.");
        }
    }

    public static boolean findHeadingByText(String text) {
        SelenideElement heading = $$("h1, h2, h3, h4, h5, h6")
                .findBy(text(text.toLowerCase(Locale.ROOT)));

        if (heading.exists()) {
            System.out.println("Found heading: <" + heading.getTagName() + "> with text: " + text);
            return true;
        } else {
            System.out.println("Heading with text '" + text + "' not found.");
            return false;
        }
    }
}
