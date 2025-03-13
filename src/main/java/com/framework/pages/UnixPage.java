package com.framework.pages;

import com.framework.components.Menu;
import static com.framework.actions.Action.*;

public class UnixPage extends BasePage{

    public boolean findPageTitle(String title) {
        return findHeadingByText(title);
    }
}
