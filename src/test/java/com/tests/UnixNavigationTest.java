package com.tests;

import com.framework.pages.UnixPage;
import com.framework.utils.TestDataProvider;
import org.testng.annotations.Test;


import static org.testng.Assert.assertTrue;

public class UnixNavigationTest extends BaseTest{

    private final UnixPage unixPage = new UnixPage();

    @Test(dataProvider = "TestData", dataProviderClass = TestDataProvider.class)
    public void navigateToUnixPage(String categoryName, String subCategoryName, String expectedTitle) {
        unixPage.selectCategory(categoryName.toLowerCase());
        unixPage.selectSubCategory(subCategoryName.toLowerCase());
        boolean isTitleExists = unixPage.findPageTitle(expectedTitle.toLowerCase());
        assertTrue(isTitleExists, "Page title should be " + expectedTitle);
    }
}
