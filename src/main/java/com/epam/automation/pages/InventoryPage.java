package com.epam.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class InventoryPage {
    WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }
    public void selectSorting(String value){
        WebElement dropdown = driver.findElement(By.cssSelector(".product_sort_container"));
        Select select = new Select(dropdown);
        select.selectByValue(value);
    }
    public List<String> getItemNames(){
        List<WebElement> items = driver.findElements(By.cssSelector(".inventory_item_name"));
        List<String> names = new ArrayList<>();
        for (WebElement item : items){
            names.add(item.getText());
        }
        return names;
    }
    public List<Double> getPrices(){
        List<WebElement> prices = driver.findElements(By.cssSelector(".inventory_item_price"));
        List<Double> list = new ArrayList<>();
        for (WebElement price : prices){
            String text = price.getText().replace("$","");
            list.add(Double.parseDouble(text));
        }
        return list;
    }
}
