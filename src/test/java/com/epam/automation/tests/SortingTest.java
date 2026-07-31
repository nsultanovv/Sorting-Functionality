package com.epam.automation.tests;

import com.epam.automation.factory.DriverFactory;
import com.epam.automation.pages.InventoryPage;
import com.epam.automation.pages.LoginPage;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingTest {

    WebDriver driver;

    @BeforeAll
    static void beforeAll(){
        System.out.println("Suite started.");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("Suite finished.");
    }
    @AfterEach
    void tearDown(){
        driver.quit();
    }

    void setup(String browser){
        driver = DriverFactory.getDriver(browser);
    }

    @ParameterizedTest
    @ValueSource(strings = {"chrome","edge"})
    void sortByNameAtoZ(String browser){
        setup(browser);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.selectSorting("az");

        List<String> actual = inventoryPage.getItemNames();
        List<String> expected = new ArrayList<>(actual);
        Collections.sort(expected);
        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @ValueSource(strings = {"chrome", "edge"})
    void sortByNameZtoA(String browser){
        setup(browser);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.selectSorting("za");

        List<String> actual = inventoryPage.getItemNames();
        List<String> expected = new ArrayList<>(actual);
        Collections.sort(expected);
        Collections.reverse(expected);
        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @ValueSource(strings = {"chrome", "edge"})
    void sortByPriceLowToHigh(String browser){
        setup(browser);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.selectSorting("lohi");

        List<Double> actual = inventoryPage.getPrices();
        List<Double> expected = new ArrayList<>(actual);
        Collections.sort(expected);
        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @ValueSource(strings = {"chrome", "edge"})
    void sortByPriceHighToLow(String browser){
        setup(browser);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.selectSorting("hilo");

        List<Double> actual = inventoryPage.getPrices();
        List<Double> expected = new ArrayList<>(actual);
        Collections.sort(expected);
        Collections.reverse(expected);
        Assertions.assertEquals(expected,actual);
    }
}
