package StepObject;

import PageObject.LoginObject;
import org.openqa.selenium.WebDriver;

import static DataObject.LogInData.incorrectUsernameData;

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

}
