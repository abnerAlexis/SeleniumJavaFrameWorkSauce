package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    private WebDriver driver;

    private By buttonAddBackPack = By.name("add-to-cart-sauce-labs-backpack");
    private By buttonAddBikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    private By buttonRemoveBikeLight = By.id("remove-sauce-labs-bike-light");
    private By buttonAddBoltTShirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private By shoppingCartLink = By.className("shopping_cart_container");
    private By shoppingCartBadge = By.className("shopping_cart_container");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addBackPack() {
        driver.findElement(buttonAddBackPack).click();
    }

    public void addBikeLight() {
        driver.findElement(buttonAddBikeLight).click();
    }

    public void removeBikeLight() {
        driver.findElement(buttonRemoveBikeLight).click();
    }

    public void addBoltTShirt() {
        driver.findElement(buttonAddBoltTShirt).click();
    }

    public String getNumberOfItemsInShoppingCart() {
        return driver.findElement(shoppingCartBadge).getText();
    }

    public boolean isShoppingCartEmpty() {
        return driver.findElement(shoppingCartBadge).isDisplayed();
    }

    public void gotoShoppingCart() {
        driver.findElement(shoppingCartLink).click();
    }
}
