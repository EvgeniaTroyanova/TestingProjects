package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class DashboardPage {

    private  WebDriver driver;
    private By userIcon=By.id("employee_infos");
    private By exitButton=By.id("header_logout");
    private By menuItemsList=By.xpath("//li[contains(@class,\"maintab\") and contains(@class,\"has_submenu\")]");



    public DashboardPage (WebDriver driver){
        this.driver=driver;
    }
    public void userIconClick(){
        driver.findElement(userIcon).click();
    }
    public void exitButtonClick(){
        driver.findElement(exitButton).click();
    }

    public void menuLinksNavigate(){
        List <WebElement> itemsList=driver.findElements(menuItemsList);
        List<String> elementIds=new ArrayList<String>();
        for (WebElement el : itemsList) {
            elementIds.add(el.getAttribute("id"));
        }

        for (String elementId: elementIds){
            driver.findElement(By.id(elementId)).click();
            String pageTitle=driver.getTitle();
            System.out.println(pageTitle);
            driver.navigate().refresh();
            Waiting.delay(1000);
            if (!driver.getTitle().equals(pageTitle))
                System.out.println("Titles are not equals");
            driver.navigate().back();
            Waiting.delay(1000);
        }
    }

}
