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
            System.out.printf("Clicked on element with text: %s", name);
        } else {
            System.out.printf("Element with text %s not found within parent.", name);
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
                System.out.printf("Clicked on element: %s", name);
                isClicked = true;
                break;
            }
        }
        if (!isClicked) {
            System.out.printf("Element %s not found.", name);
        }
    }

    public static boolean findHeadingByText(String text) {
        SelenideElement heading = $$("h1, h2, h3, h4, h5, h6")
                .findBy(Condition.text(text));

        if (!heading.exists()) {
            System.out.printf("Heading with text '%s' not found.%n", text);
            return false;
        }
        System.out.printf("Found heading: <%s> with text: %s%n", heading.getTagName(), heading.getText());
        return true;
    }
}
