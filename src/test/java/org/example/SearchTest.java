package org.example;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchTest extends BaseTest {
    private final String searchWord = ReaderHelper.getConf().getSearchWord();

    @Test(priority = 4)
    @Description("Test of the search operation.")
    public void testSearch() {
        new HomePage(driver)
                .searchButtonClick()
                .searchFieldSend(searchWord)
                .foundNews();
    }
}
//end

