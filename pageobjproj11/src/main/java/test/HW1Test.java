package test;

import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.Waiting;
import org.openqa.selenium.WebDriver;

public class HW1Test extends BaseTest {

    private static WebDriver driver = getChromeDriver();

    public static void main(String[] args) {
        HW1Test hw1test1=new HW1Test();
        hw1test1.TaskA();
        hw1test1.TaskB();
        quitChromeDriver(driver);

    }
    public void TaskA(){
        LoginPage logPage = new LoginPage(driver);
        logPage.openPage("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        logPage.inputLogin();
        logPage.inputPassword();
        Waiting.delay(1000);
        logPage.loginButtonClick();
        Waiting.delay(1000);
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.userIconClick();
        dashboardPage.exitButtonClick();

    }
    public void TaskB(){
        LoginPage logPage = new LoginPage(driver);
        logPage.openPage("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        logPage.inputLogin();
        logPage.inputPassword();
        logPage.loginButtonClick();
        Waiting.delay(1000);
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.menuLinksNavigate();
        dashboardPage.userIconClick();
        dashboardPage.exitButtonClick();

    }

}
