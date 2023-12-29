package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserActions {

  public static  WebDriver driver = new ChromeDriver();

    @BeforeMethod

    public void openBrowser(){
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/inventory.html");
    }

    @AfterMethod

    public void closeBrowser(){
        driver.quit();
    }



}
