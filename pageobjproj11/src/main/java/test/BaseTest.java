package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    public static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
    public static void quitChromeDriver(WebDriver driver) {
        driver.quit();
    }

}
