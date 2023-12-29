package StepObject;

import PageObject.AddToCartObject;
import org.openqa.selenium.WebDriver;

public class AddToCartSteps extends AddToCartObject {
    WebDriver driver;


    public AddToCartSteps (WebDriver driver1){
        driver = driver1;
    }

    public void addItemAction () {driver.findElement(addToCart).click();}
    public void addItemAction2 () {driver.findElement(addToCart2).click();}
    public void addItemAction3 () {driver.findElement(addToCart3).click();}
    public void addItemAction4 () {driver.findElement(addToCart4).click();}
    public void addItemAction5 () {driver.findElement(addToCart5).click();}
    public void addItemAction6 () {driver.findElement(addToCart6).click();}

    public void removeItemAction () {driver.findElement(removeItem).click();}


}
