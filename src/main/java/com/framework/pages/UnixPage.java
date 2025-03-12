package com.framework.pages;

import com.framework.components.Menu;
import static com.framework.actions.Action.*;

public class UnixPage extends BasePage{

    private final Menu menu = new Menu();

    public void selectCategory(String name) {
        menu.selectCategory(name);
    }

    public void selectSubCategory(String name) {
        menu.selectSubCategory(name);
    }

    public boolean findPageTitle(String title) {
        return findHeadingByText(title);
    }
}
