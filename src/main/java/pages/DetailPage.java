package pages;

import basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DetailPage extends BasePage {
    public DetailPage(WebDriver driver) {
        super(driver);
    }
//    private final By reserveCTA =By.xpath("(//span[@class='bui-button__text'][normalize-space()='Reserve'])[1]");

    private final By availableHead = By.xpath("//th[@class='hprt-table-header-cell -first']");
    private  final By deluxe = By.xpath("//a[@id='room_type_id_78883128']");
    /*
    Can you please check this deluxe locator. Its dynamic
     */
    private final By bedSelect = By.xpath("//input[@type='radio' and @value='1' and @name='bedPreference_78883128']");
    private final By saleAmount = By.xpath("//select[@id='hprt_nos_select_78883128_373531459_2_33_0_131741']");
    private final By reserveCTA= By.xpath("//div[@class='hprt-reservation-cta']//button[@type='submit']");
    /*
    Can you please check this reserve cta locator. Its work for me before but not now
     */
    private final By confirmDetails = By.xpath("//h2[normalize-space()='Enter your details']");

    /*
    Some time i got this stale error -
    org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found in the current frame
     */


    public void checkDetail(){
//        visibilityChecker(reserveCTA);
        //clickOn(reserveCTA);
        scrollToElement(availableHead);
        visibilityChecker(availableHead);
        scrollToElement(deluxe);
        visibilityChecker(deluxe);
        clickOn(bedSelect);
        visibilityChecker(saleAmount);
        clickOn(saleAmount);
        driver.findElement(saleAmount).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(saleAmount).sendKeys(Keys.ENTER);

        clickOn(reserveCTA);
        visibilityChecker(confirmDetails);




//        Assert.assertTrue(assertElementDisplayed(availableHead));
    }
}
