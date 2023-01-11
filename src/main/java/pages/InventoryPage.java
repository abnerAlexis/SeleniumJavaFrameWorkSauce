package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    private WebDriver driver;
    private By shoppingCartLink = By.className("shopping_cart_container");
    private By shoppingCartBadge = By.className("#shopping_cart_container");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void gotoShoppingCart() {
        driver.findElement(shoppingCartLink).click();
    }
}
