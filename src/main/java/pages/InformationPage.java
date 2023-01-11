package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class InformationPage {
    WebDriver driver;
    private By firstnameBox = By.id("first-name");
    private By lastnameBox = By.id("last-name");
    private By zipCodeBox = By.id("postal-code");
    private By buttonContinue = By.id("continue");

    public InformationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInformationForm(String firstname, String lastname, String zipcode) {
        driver.findElement(firstnameBox).sendKeys(firstname);
        driver.findElement(lastnameBox).sendKeys(lastname);
        driver.findElement(zipCodeBox).sendKeys(zipcode);
        driver.findElement(buttonContinue).click();
    }
}
