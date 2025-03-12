package com.tests;

import com.framework.pages.HomePage;
import com.framework.pages.UnixPage;
import com.utils.TestDataProvider;
import org.testng.annotations.Test;


import static org.testng.Assert.assertTrue;

public class UnixNavigationTest extends BaseTest{

    private final HomePage homePage = new HomePage();
    private final UnixPage unixPage = new UnixPage();

    @Test(dataProvider = "TestData", dataProviderClass = TestDataProvider.class)
    public void navigateToUnixPage(String categoryName, String subCategoryName, String expectedTitle) {
        homePage.openPage(BASE_URL);
        homePage.selectCategory(categoryName.toLowerCase());
        homePage.selectSubCategory(subCategoryName.toLowerCase());
        boolean isTitleExists = unixPage.getPageTitle(expectedTitle.toLowerCase());
        System.out.println("Title" + isTitleExists);
        assertTrue(isTitleExists, "Page title should be " + expectedTitle);
    }
}
