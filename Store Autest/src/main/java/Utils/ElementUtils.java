package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public final class ElementUtils {

    // Prevents this class from being instantiated
    private ElementUtils() {
    }

      /*
      Wrapper method looks good, however when implementing this, there is no need for final keyword to be used.
     */
    public static boolean isDisplayed(final WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException ignored) {
            return false;
        }
    }

    public static void scroll(final WebDriver driver, final String text) {
        driver.findElement(By.id("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".scrollIntoView(new UiSelector().textContains(\"" + text + "\").instance(0))"));
    }
}
