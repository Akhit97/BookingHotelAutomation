package basetest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    @BeforeClass
    public void setDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//        try {
//            Alert alert = driver.switchTo().alert();
//            alert.accept();
//        } catch (NoAlertPresentException ne){
//            System.out.println("Alert not displayed");
//            ne.printStackTrace();
//        }


    }
    @AfterClass
    public void closeDriver(){
        if (driver != null) {
            driver.quit();
        }
    }
}
