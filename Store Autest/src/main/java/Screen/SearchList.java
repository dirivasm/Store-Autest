package Screen;

import Utils.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public final class SearchList {

    private static WebDriver driver;

   private final WebElement firstResult = driver.findElement(By.className("product-image-container"));

   public boolean isTheresaResult() {
       return ElementUtils.isDisplayed(firstResult);
   }

   public void selectFirstResult() {
       firstResult.click();
   }

}
