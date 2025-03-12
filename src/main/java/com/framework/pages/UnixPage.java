package com.framework.pages;

import static com.framework.actions.Action.*;

public class UnixPage {

    public boolean getPageTitle(String title) {
        return findHeadingByText(title);
    }
}
