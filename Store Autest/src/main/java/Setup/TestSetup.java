package Setup;

import Utils.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.rmi.CORBA.Util;

public class TestSetup {
    private static WebDriver driver;

        /*
         - Always remember to reference your file in a relative way - /Users/jconcepcion is not a valid path for the project to be portable
         - Another alternative to avoid this is using below maven dependency (In order to handle the WebDriver):

            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
         */
    public static void Setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/jconcepcion/IdeaProjects/Store Autest/src/main/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        Wait.until(5);
    }
}
