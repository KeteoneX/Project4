package StepObject;

import PageObject.AddToCartObject;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class AddToCartSteps extends AddToCartObject {
    WebDriver driver;


    public AddToCartSteps (WebDriver driver1){
        driver = driver1;
    }

    @Step("ერთი პროდუქტის დამატება")
    public void addItemAction () {driver.findElement(addToCart).click();}
    @Step("მეორე პროდუქტის დამატება")
    public void addItemAction2 () {driver.findElement(addToCart2).click();}
    @Step("მესამე პროდუქტის დამატება")
    public void addItemAction3 () {driver.findElement(addToCart3).click();}
    @Step("მეოთხე პროდუქტის დამატება")
    public void addItemAction4 () {driver.findElement(addToCart4).click();}
    @Step("მეხუთე პროდუქტის დამატება")
    public void addItemAction5 () {driver.findElement(addToCart5).click();}
    @Step("მეექვსე პროდუქტის დამატება")
    public void addItemAction6 () {driver.findElement(addToCart6).click();}

    @Step("პროდიქტის რემოვი")
    public void removeItemAction () {driver.findElement(removeItem).click();}


}
