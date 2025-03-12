package com.framework.pages;

import static com.framework.actions.Action.*;

public class UnixPage {

    public boolean findPageTitle(String title) {
        return findHeadingByText(title);
    }
}
