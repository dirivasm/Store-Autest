package Screen;

import Utils.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public final class HomeScreen {

       /*
          Using WebDriver as static variable could affect parallel execution. It is a good implementation if you are not planning to parallely execute your tests
          however, In practice, you should always aim to reduce execution time by handling your architecture and build your tests so they can be executed parallely
     */
    private static WebDriver driver;

    private final WebElement yourLogo = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
    private final WebElement searchBar = driver.findElement(By.id("search_query_top"));
    private final WebElement btnSearch = driver.findElement(By.className("//*[@id=\"searchbox\"]/button"));
    private final WebElement btnShoppingCar = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
    private final WebElement storeDirection = driver.findElement(By.xpath("//*[@id=\"block_contact_infos\"]/div/ul"));
    private final WebElement storePhone = driver.findElement(By.xpath("//*[@id=\"block_contact_infos\"]/div/ul/li[2]"));
    private final WebElement storeMail = driver.findElement(By.xpath("//*[@id=\"block_contact_infos\"]/div/ul/li[3]"));

    public boolean isHomepageThere() {
        return ElementUtils.isDisplayed(yourLogo);
    }

    public void searchProduct() {
        searchBar.sendKeys("blouse");
        btnSearch.click();
    }

    public void selectShoppingCar() {
        btnShoppingCar.click();
    }

    public boolean isStoreAddressThere() {
        ElementUtils.scroll(driver,"Store information");
        return ElementUtils.isDisplayed(storeDirection);
    }

    public boolean isStorePhoneThere() {
        ElementUtils.scroll(driver,"Store information");
        return ElementUtils.isDisplayed(storePhone);
    }

    public boolean isStoreMailThere () {
        ElementUtils.scroll(driver,"Store information");
        return ElementUtils.isDisplayed(storeMail);
    }

}
