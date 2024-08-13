package tests;

import basetest.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ConfirmationPage;
import pages.DetailPage;
import pages.ResultPage;
import pages.SearchScreen;

public class SearchTest extends BaseTest {
    SearchScreen search;
    ResultPage result;
    DetailPage detail;
    ConfirmationPage confirm;
    @BeforeClass
    public void initObjects(){
        search = new SearchScreen(driver);
        result = new ResultPage(driver);
        detail = new DetailPage(driver);
        confirm = new ConfirmationPage(driver);


    }
    @Test
    public void tc_validateSeach(){
        search.checkSearchSuccess("Alexandria");
        result.checkResultScreen();
        detail.checkDetail();
        confirm.checkConfirmations();
    }
}
