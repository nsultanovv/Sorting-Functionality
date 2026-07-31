package com.epam.automation.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
    public static WebDriver getDriver(String browser){
        if (browser.equalsIgnoreCase("chrome")){
            return new ChromeDriver();
        }
        return new EdgeDriver();
    }
}
