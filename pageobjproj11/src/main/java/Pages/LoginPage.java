package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private String email="webinar.test@gmail.com";
    private String password="Xcg7299bnSmMuRLp9ITw";
    private By login=By.id("email");
    private By passw=By.id("passwd");
    private By logButton=By.name("submitLogin");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void openPage(String pageURL){
        driver.get(pageURL);
    }
    public void inputLogin(){
        driver.findElement(login).sendKeys(email);
    }
    public void inputPassword(){
        driver.findElement(passw).sendKeys(password);
    }
    public void loginButtonClick(){

        driver.findElement(logButton).click();
    }

}
