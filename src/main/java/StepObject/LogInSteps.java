package StepObject;

import PageObject.LoginObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static DataObject.LogInData.*;

public class LogInSteps extends LoginObject {
    WebDriver driver;

    public LogInSteps(WebDriver driver1){
        driver = driver1;

    }

    public void usernameFieldAction(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void passwordFieldAction(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void logInButtonAction () {
        driver.findElement(logInButton).click();


    }
    public void incorrectUsernameAction (String incorrectUsername) {driver.findElement(usernameField).sendKeys(incorrectUsernameData);}

    public void emptyUsernameAction (String emptyUsername) {driver.findElement(usernameField).sendKeys(emptyUsernameData);}

    public void emptyPasswordAction (String emptyPassword) {driver.findElement(passwordField).sendKeys(emptyPasswordData);}

    public void burgerMenuAction(){driver.findElement(burgerMenu).click();}
    public void logoutAction () {driver.findElement(logout).click();};

    public void logInButtonWithEnterAction() {driver.findElement(logInButton).sendKeys(Keys.ENTER);}

    public void passwordWithSpaceAction (String passwordWithSpace) {driver.findElement(passwordField).sendKeys(passwordWithSpaceData);}

    public void usernameWithSpaceAction (String usernameWithSpace) {driver.findElement(usernameField).sendKeys(usernameWithSpaceData);}
}
