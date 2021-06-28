package com.course.testng.groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author KyrianSun
 * @create 2021-06-27 23:38
 */
public class BasePage {
    public BaseDriver driver;
    public BasePage (BaseDriver driver){
        this.driver = driver;
    }
    public WebElement element(By by){
        WebElement element = driver.findElement(by);
        return element;
    }
    public void click(WebElement element){
        element.click();
    }
}
