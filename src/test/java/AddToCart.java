import Browser.BrowserActions;
import StepObject.AddToCartSteps;
import StepObject.LogInSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static DataObject.LogInData.correctPasswordData;
import static DataObject.LogInData.correctUsernameData;

public class AddToCart  extends BrowserActions {

    @Test( priority = 1)
    public void addOneItem() throws InterruptedException {
        AddToCartSteps step1 = new AddToCartSteps(driver);
        LogInSteps step2 = new LogInSteps(driver);
        step2.usernameFieldAction(correctUsernameData);
        step2.passwordFieldAction(correctPasswordData);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        step2.logInButtonAction();

        Thread.sleep(3000);
        step1.addItemAction();


    }

    @Test(priority = 2)
    public void AddItemAndRemove () throws InterruptedException{
        AddToCartSteps step1 = new AddToCartSteps(driver);
        LogInSteps step2 = new LogInSteps(driver);
        step2.usernameFieldAction(correctUsernameData);
        step2.passwordFieldAction(correctPasswordData);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        step2.logInButtonAction();

        step1.addItemAction();

        Thread.sleep(3000);

        step1.removeItemAction();

    }
    @Test (priority = 3)
    public void addAllItem () throws InterruptedException {
        LogInSteps step1 = new LogInSteps(driver);
        AddToCartSteps step2 = new AddToCartSteps(driver);
        step1.usernameFieldAction(correctUsernameData);
        step1.passwordFieldAction(correctPasswordData);
        step1.logInButtonAction();

        step2.addItemAction();
        Thread.sleep(2000);
        step2.addItemAction2();
        Thread.sleep(2000);
        step2.addItemAction3();
        Thread.sleep(2000);
        step2.addItemAction4();
        Thread.sleep(2000);
        step2.addItemAction5();
        Thread.sleep(2000);
        step2.addItemAction6();

        WebElement cartCountElement = driver.findElement(By.className("shopping_cart_badge"));
        int
                actualCartCount = Integer.parseInt(cartCountElement.getText()),
                expectedCartCount = 6;


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedCartCount, actualCartCount);
        softAssert.assertAll();




    }









}
