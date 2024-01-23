package StepObject;

import PageObject.LoginObject;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static DataObject.LogInData.*;

public class LogInSteps extends LoginObject {
    WebDriver driver;

    public LogInSteps(WebDriver driver1){
        driver = driver1;

    }

    @Step("ვალიდური მომხმარებელი")
    public void usernameFieldAction(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    @Step("ვალიდური პაროლი")
    public void passwordFieldAction(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    @Step("log In ღილაკი")
    public void logInButtonAction () {
        driver.findElement(logInButton).click();


    }
    @Step("არავალიდური მომხმარებელი")
    public void incorrectUsernameAction (String incorrectUsername) {driver.findElement(usernameField).sendKeys(incorrectUsernameData);}

    @Step("მომხმარებლის ცარიელი ველი")
    public void emptyUsernameAction (String emptyUsername) {driver.findElement(usernameField).sendKeys(emptyUsernameData);}

    @Step("ცარიელი ფასვორდის ველი")
    public void emptyPasswordAction (String emptyPassword) {driver.findElement(passwordField).sendKeys(emptyPasswordData);}

    @Step("ბურგერ მენიუზე დაკლიკვა")
    public void burgerMenuAction(){driver.findElement(burgerMenu).click();}
    @Step("დალოგაუთება")
    public void logoutAction () {driver.findElement(logout).click();};

    @Step("დალოგინება ენთერ ღილაკით")
    public void logInButtonWithEnterAction() {driver.findElement(logInButton).sendKeys(Keys.ENTER);}

    @Step("ფასვორდი სფეისებით")
    public void passwordWithSpaceAction (String passwordWithSpace) {driver.findElement(passwordField).sendKeys(passwordWithSpaceData);}

    @Step("მომახმარებელი სფეისებით")
    public void usernameWithSpaceAction (String usernameWithSpace) {driver.findElement(usernameField).sendKeys(usernameWithSpaceData);}
}
