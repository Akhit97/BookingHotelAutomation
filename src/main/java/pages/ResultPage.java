package pages;

import basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ResultPage extends BasePage {
    public ResultPage(WebDriver driver) {
        super(driver);
    }
    private final By filter = By.xpath("(//*[normalize-space() = 'Filter by:'])[1]");
    private final By result = By.xpath("//div[normalize-space()='Tolip Hotel Alexandria']");
    private final By availableCTA = By.xpath("//a[@data-testid='availability-cta-btn' and contains(@href, 'royal-tulip-alexandria.html')]");
    private final By reserveCTA =By.xpath("(//span[@class='bui-button__text'][normalize-space()='Reserve'])[1]");
    private final By availableHead = By.xpath("//th[@class='hprt-table-header-cell -first']");



    public void checkResultScreen(){
        visibilityChecker(filter);
        scrollToElement(result);
        Assert.assertTrue(assertElementDisplayed(result));
        clickOn(availableCTA);
        switchToWindowByIndex(2);
        scrollToElement(availableHead);
//        visibilityChecker(reserveCTA);

//        Set<String> windowIds = driver.getWindowHandles();
//
//        for (String windowId : windowIds){
//            driver.switchTo().window(windowId);
//
//            if(driver.getTitle().equals("Tolip Hotel Alexandria")){
//                String url = driver.getCurrentUrl();
//                System.out.println(url);
//                driver.close();
//            }
//
//        }

    }
}
