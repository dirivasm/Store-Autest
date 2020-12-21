package Screen;

import Utils.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCar {

    private WebDriver driver;

    WebElement btnRemoveProduct = driver.findElement(By.id("2_7_0_0"));
    WebElement carEmptyMsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));


    public void removeProduct () {
        btnRemoveProduct.click();
    }

    public boolean wasproductremoved() {
        return ElementUtils.isDisplayed(carEmptyMsg);
    }
}
