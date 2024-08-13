package pages;

import basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ConfirmationPage extends BasePage {
    public ConfirmationPage(WebDriver driver) {
        super(driver);
    }
    private final By confirmDetails = By.xpath("//h2[normalize-space()='Enter your details']");
    private final By priceSummary = By.xpath("(//*[normalize-space()='Your price summary'])[2]");

    public void checkConfirmations(){
        visibilityChecker(confirmDetails);
        Assert.assertTrue(checkElementDisplay(confirmDetails));
        scrollToElement(priceSummary);
        visibilityChecker(priceSummary);
        Assert.assertTrue(checkElementDisplay(priceSummary));
    }
}
