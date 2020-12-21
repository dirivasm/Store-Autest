import Setup.TestSetup;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Screen.HomeScreen;
import Screen.ProductScreen;
import Screen.SearchList;
import Screen.ShoppingCar;

import java.util.List;
import java.util.Set;


public final class ShoppingCarTest {

    private WebDriver driver;
    private HomeScreen homeScreen;
    private ProductScreen productScreen;
    private SearchList searchList;
    private ShoppingCar shoppingCar;

    // Prevents this class from being instantiated
    private ShoppingCarTest() {
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        TestSetup.Setup();
         /*
            This should be handled within Setup() method since is not related either to Data Generation nor Test implementation.
            Removing this will avoid DRY Anti Pattern to be introduced
         */
        driver = new WebDriver() {
            public void get(String s) {

            }

            public String getCurrentUrl() {
                return null;
            }

            public String getTitle() {
                return null;
            }

            public List<WebElement> findElements(By by) {
                return null;
            }

            public WebElement findElement(By by) {
                return null;
            }

            public String getPageSource() {
                return null;
            }

            public void close() {

            }

            public void quit() {

            }

            public Set<String> getWindowHandles() {
                return null;
            }

            public String getWindowHandle() {
                return null;
            }

            public TargetLocator switchTo() {
                return null;
            }

            public Navigation navigate() {
                return null;
            }

            public Options manage() {
                return null;
            }
        };
        homeScreen = new HomeScreen();
        productScreen = new ProductScreen();
        searchList = new SearchList();
        shoppingCar = new ShoppingCar();
    }

    @Test
    public void canAddProductToShoppingCar() {
        homeScreen.isHomepageThere();
        homeScreen.searchProduct();
        searchList.selectFirstResult();
        productScreen.addProducttothecar();
        productScreen.wasProductAdded();
        Assert.assertTrue(productScreen.wasProductAdded());
    }

    @Test
    public void canRemoveAnyProduct(){
        homeScreen.selectShoppingCar();
        shoppingCar.removeProduct();
        Assert.assertTrue(shoppingCar.wasproductremoved());
    }

    @Test
    public void canSeeStoreInfo(){
        homeScreen.isStoreAddressThere();
        homeScreen.isStorePhoneThere();
        homeScreen.isStoreMailThere();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
