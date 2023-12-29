package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserActions {

    public static WebDriver driver;

    @BeforeMethod
    public  void openBrowser(){
        if (driver ==null){
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
        driver = null;


    }
}
