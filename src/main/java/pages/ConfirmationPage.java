package pages;

import basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ConfirmationPage extends BasePage {
    public ConfirmationPage(WebDriver driver) {
        super(driver);
    }
    private final By hotelTitle = By.xpath("//h1[normalize-space()='Tolip Hotel Alexandria']");
    private final By priceSummary = By.xpath("(//*[normalize-space()='Your price summary'])[2]");

    public void checkConfirmations(){
        visibilityChecker(hotelTitle);
        Assert.assertTrue(checkElementDisplay(hotelTitle));
        scrollToElement(priceSummary);
        visibilityChecker(priceSummary);
        Assert.assertTrue(checkElementDisplay(priceSummary));
    }
}
