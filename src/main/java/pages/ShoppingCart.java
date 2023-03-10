package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart {
    private WebDriver driver;

    private By shoppingCartBadge = By.className("shopping_cart_container");
    private By buttonContinueShopping = By.id("continue-shopping");
    private By buttonCheckout = By.id("checkout");

    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
    }

    public InventoryPage continueShopping() {
        driver.findElement(buttonContinueShopping).click();
        return new InventoryPage(driver);
    }

    public InformationPage checkout() {
        driver.findElement(buttonCheckout).click();
        return new InformationPage(driver);
    }
}
