package com.epam.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void login(){
        driver.get("https://www.saucedemo.com");

        driver.findElement(By.xpath("//input[@id='user-name']"))
                .sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']"))
                .sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']"))
                .click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".product_sort_container")));
    }
}
