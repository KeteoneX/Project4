import StepObject.LogInSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.time.Duration;
import static DataObject.LogInData.*;
public class LogIn {
    WebDriver driver;

    @BeforeMethod(description = "Setup browser")
    public void SetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/inventory.html");
    }

    @Test(priority = 1)
    public void loginWithCorrectData() throws InterruptedException {
        LogInSteps step1 = new LogInSteps(driver);
        step1.usernameFieldAction(correctUsernameData);
        Thread.sleep(3000);
        step1.passwordFieldAction(correctPasswordData);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        step1.logInButtonAction();


        String
                expectedUrl = "https://www.saucedemo.com/inventory.html",
                actualUrl = driver.getCurrentUrl();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedUrl, actualUrl);
        softAssert.assertAll();

        Thread.sleep(5000);


    }

    @Test(priority = 2)
    public void incorrectUsernameAndPass() throws InterruptedException {

        LogInSteps step2 = new LogInSteps(driver);
        step2.incorrectUsernameAction(incorrectUsernameData);
        step2.passwordFieldAction(incorrectPasswordData);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        step2.logInButtonAction();

        String
                expectedUrl = "https://www.saucedemo.com/",
                actualUrl = driver.getCurrentUrl();



        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedUrl, actualUrl);
        softAssert.assertAll();
        Thread.sleep(5000);


    }


    @AfterMethod

    public void closeBrowser() {
        driver.quit();

    }
}

