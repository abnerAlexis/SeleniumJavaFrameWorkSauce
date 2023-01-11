package com.test;

import org.testng.annotations.Test;
import pages.InformationPage;
import pages.InventoryPage;
import pages.LoginPage;
import pages.Overview;
import pages.ShoppingCart;
import static org.testng.Assert.assertEquals;

public class TestClass extends BaseTests {
    private LoginPage loginPage = new LoginPage(driver);
    private InventoryPage inventoryPage = new InventoryPage(driver);
    private ShoppingCart shoppingCart = new ShoppingCart(driver);
    private InformationPage informationPage = new InformationPage(driver);
    private Overview overview = new Overview(driver);

    @Test
    public void validateSauceLab() {
        String username = getPropertyValue("username").toString();
        String password = getPropertyValue("password").toString();
        loginPage.login(username, password);

        boolean actual = inventoryPage.isShoppingCartEmpty();
        boolean expected = true;
        assertEquals(actual, expected);

        inventoryPage.addBackPack();
        String actualNumber = inventoryPage.getNumberOfItemsInShoppingCart();
        String expectedNumber = "1";
        assertEquals(actualNumber, expectedNumber);

        inventoryPage.addBikeLight();
        actualNumber = inventoryPage.getNumberOfItemsInShoppingCart();
        expectedNumber = "2";
        assertEquals(actualNumber, expectedNumber);

        inventoryPage.addBoltTShirt();
        actualNumber = inventoryPage.getNumberOfItemsInShoppingCart();
        expectedNumber = "3";
        assertEquals(actualNumber, expectedNumber);

        inventoryPage.removeBikeLight();
        actualNumber = inventoryPage.getNumberOfItemsInShoppingCart();
        expectedNumber = "2";
        assertEquals(actualNumber, expectedNumber);

        inventoryPage.gotoShoppingCart();
        shoppingCart.checkout();

        informationPage.fillInformationForm("Zara", "Bush", "diefe57589");

        String actualValue= overview.getItemBackPack();
        String expectedValue = "Sauce Labs Backpack";
        assertEquals(actualValue, expectedValue);

        actualValue = overview.getBackpackPrice();
        expectedValue = "$29.99";
        assertEquals(actualValue, expectedValue);

        actualValue = overview.getItemBoltTShirt();
        expectedValue = "Sauce Labs Bolt T-Shirt";
        assertEquals(actualValue, expectedValue);

        actualValue = overview.getBoltTShirtPrice();
        expectedValue = "$15.99";
        assertEquals(actualValue, expectedValue);

        actualValue = overview.getItemTotal();
        expectedValue = "Item total: $45.98";
        assertEquals(actualValue, expectedValue);

        actualValue = overview.getTax();
        expectedValue = "Tax: $3.68";
        assertEquals(actualValue, expectedValue);

        actualValue = overview.getTotal();
        expectedValue = "Total: $49.66";
        assertEquals(actualValue, expectedValue);

        overview.finishShopping();
    }
}
