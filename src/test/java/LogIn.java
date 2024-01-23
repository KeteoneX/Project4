import Browser.BrowserActions;
import StepObject.LogInSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.time.Duration;

import static DataObject.LogInData.*;
public class LogIn extends BrowserActions {

    @Test(priority = 1)
    @Description("დალოგინება სწორი მონაცემებით")
    @Severity(SeverityLevel.CRITICAL)

    public void loginWithCorrectData() throws InterruptedException {
        try {
            LogInSteps step1 = new LogInSteps(driver);
            step1.usernameFieldAction(correctUsernameData);
            Thread.sleep(3000);
            step1.passwordFieldAction(correctPasswordData);
            Thread.sleep(3000);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
            step1.logInButtonAction();

        } catch (Exception e){
        System.out.println( "ლოგინი ან პაროლი არასწორია");}



        String
                expectedUrl = "https://www.saucedemo.com/inventory.html",
                actualUrl = driver.getCurrentUrl();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedUrl, actualUrl);
        softAssert.assertAll();




    }

    @Description("დალოგინება არასწორი მონაცემებით")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2)
    public void incorrectUsernameAndPass() throws InterruptedException {

        LogInSteps step2 = new LogInSteps(driver);
        step2.incorrectUsernameAction(incorrectUsernameData);
        step2.passwordFieldAction(incorrectPasswordData);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        Thread.sleep(3000);
        step2.logInButtonAction();

        String
                expectedUrl = "https://www.saucedemo.com/",
                actualUrl = driver.getCurrentUrl();



        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedUrl, actualUrl);
        softAssert.assertAll();
        Thread.sleep(3000);


    }

    @Description("დალოგინება ცარიელი მომხმარებლის ველით")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void emptyUsername () throws InterruptedException {
        LogInSteps step3 = new LogInSteps(driver);
        step3.emptyUsernameAction(emptyUsernameData);
        step3.passwordFieldAction(correctPasswordData);
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        step3.logInButtonAction();


    }
    @Description("დალოგინება ცარიელი პაროლის ველით")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void emptyPassword() throws InterruptedException {
        LogInSteps step4 = new LogInSteps(driver);
        step4.usernameFieldAction(correctUsernameData);
        step4.passwordFieldAction(emptyPasswordData);
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        step4.logInButtonAction();

    }
    @Description("დალოგინება ვალიდურად და დალოგაუთება")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void LoginAndLogout () throws InterruptedException {
        LogInSteps step5 = new LogInSteps(driver);
        step5.usernameFieldAction(correctUsernameData);
        step5.passwordFieldAction(correctPasswordData);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        step5.logInButtonAction();
        Thread.sleep(3000);

        step5.burgerMenuAction();
        Thread.sleep(3000);
        step5.logoutAction();
        String
                expectedUrl = "https://www.saucedemo.com/",
                actualUrl = driver.getCurrentUrl();



        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedUrl, actualUrl);
        softAssert.assertAll();

    }
    @Description("დალოგინება ენთერ ღილაკით")
    @Severity(SeverityLevel.NORMAL)
    @Test (priority = 6)
    public void logInButtonWithEnter () throws InterruptedException {
        LogInSteps step6 = new LogInSteps(driver);
        step6.usernameFieldAction(correctUsernameData);
        Thread.sleep(2000);
        step6.passwordFieldAction(correctPasswordData);
        Thread.sleep(2000);
        step6.logInButtonWithEnterAction();
        Thread.sleep(2000);
       String
               expectedTitle = "Swag Labs",
               actualTitle = driver.getTitle();
       SoftAssert softAssert = new SoftAssert();
       softAssert.assertEquals(expectedTitle, actualTitle);
       softAssert.assertAll();

    }
    @Description("დალოგინება სფეისებით")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 7)
    public void LoginWithSpaceUsernameAndPassword () throws InterruptedException {
        LogInSteps step7 = new LogInSteps(driver);
        step7.usernameWithSpaceAction(usernameWithSpaceData);
        Thread.sleep(1000);
        step7.passwordWithSpaceAction(passwordWithSpaceData);
        Thread.sleep(1000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));

        step7.logInButtonAction();



    }





}

