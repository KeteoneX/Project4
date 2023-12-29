package PageObject;

import org.openqa.selenium.By;

public class LoginObject {

   protected By
    usernameField = By.id("user-name"),
    passwordField = By.name("password"),
    logInButton = By.xpath("//*[@id=\"login-button\"]"),
   burgerMenu = By.id("react-burger-menu-btn"),
   logout = By.id("logout_sidebar_link");




}
