package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Overview {
    WebDriver driver;
    private By backpack = By.id("item_4_title_link");
    private By backpackPrice = By.xpath("(//div[@class='inventory_item_price'])[1]");
    private By boltShirt = By.id("item_1_title_link");
    private By boltShirtPrice = By.xpath("(//div[@class='inventory_item_price'])[2]");
    private By itemTotalLabel = By.cssSelector("div.summary_subtotal_label");
    private By taxLabel = By.cssSelector("div.summary_tax_label");
    private By totalLabel = By.cssSelector("div.summary_total_label");
    private By buttonFinish = By.id("finish");

    public Overview(WebDriver driver) {
        this.driver = driver;
    }

    public String getItemBackPack() {
        return driver.findElement(backpack).getText();
    }

    public String getBackpackPrice() {
        return driver.findElement(backpackPrice).getText();
    }

    public String getItemBoltTShirt() {
        return driver.findElement(boltShirt).getText();
    }

    public String getBoltTShirtPrice() {
        return driver.findElement(boltShirtPrice).getText();
    }

    public String getItemTotal() {
        return driver.findElement(itemTotalLabel).getText();
    }

    public String getTax() {
        return driver.findElement(taxLabel).getText();
    }

    public String getTotal() {
        return driver.findElement(totalLabel).getText();
    }

    public void finishShopping() {
        driver.findElement(buttonFinish).click();
    }
}
