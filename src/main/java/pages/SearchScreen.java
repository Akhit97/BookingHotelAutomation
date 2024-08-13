package pages;

import basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.Duration;
import java.util.Date;

public class SearchScreen extends BasePage {
    public SearchScreen(WebDriver driver) {
        super(driver);
    }

    private final By closePopCTA = By.xpath("//button[@aria-label='Dismiss sign-in info.' and @type='button']");
    private final By destinationInput = By.id(":r8:");
//    private final By checkIn = By.xpath("(//button[normalize-space() = 'Check-in date'])");
//    private final By checkOut = By.xpath("(//button[normalize-space() = 'Check-out date'])");
    private final By selectCheckInDate = By.xpath("//span[@aria-label='15 August 2024']");
    private final By selectCheckOutDate = By.xpath("//span[@aria-label='17 August 2024']");
    private final By searchCTA = By.xpath("//button[@type='submit']");

    private final By filter = By.xpath("(//*[normalize-space() = 'Filter by:'])[1]");




    public void checkSearchSuccess(String destination){
        visibilityChecker(closePopCTA);
        clickOn(closePopCTA);
        scrollToElement(destinationInput);
        sendText(destination, destinationInput);
        Actions actions = new Actions(driver);
        actions.pause(Duration.ofSeconds(5)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        clickOn(selectCheckInDate);

        clickOn(selectCheckOutDate);
        clickOn(searchCTA);
        visibilityChecker(filter);




    }

}


