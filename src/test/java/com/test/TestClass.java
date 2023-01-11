package com.test;

import org.testng.annotations.Test;
import pages.InformationPage;
import pages.InventoryPage;
import pages.LoginPage;
import pages.ShoppingCart;
import static org.testng.Assert.assertEquals;

public class TestClass extends BaseTests {
    private LoginPage loginPage = new LoginPage(driver);
    private InventoryPage inventoryPage = new InventoryPage(driver);
    private ShoppingCart shoppingCart = new ShoppingCart(driver);
    private InformationPage informationPage = new InformationPage(driver);

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

    }
}
