package Screen;

import Utils.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public final class ProductScreen {

    private static WebDriver driver;

    private final WebElement btnAddtoTheCar = driver.findElement(By.id("add_to_cart"));
    private final WebElement checkIcon = driver.findElement(By.className("icon-ok"));
    private final WebElement btnRemove = driver.findElement(By.id("2_7_0_0"));

    public void addProducttothecar() {
        btnAddtoTheCar.click();
    }

    public boolean wasProductAdded() {
        return ElementUtils.isDisplayed(checkIcon);
    }

}