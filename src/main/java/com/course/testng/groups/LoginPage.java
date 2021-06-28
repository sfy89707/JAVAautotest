package com.course.testng.groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author KyrianSun
 * @create 2021-06-27 23:45
 */
public class LoginPage extends BasePage{
    public LoginPage(BaseDriver driver){
        super(driver);
    }
    public WebElement getUserElement(){
        return element(By.id("name"));
    }
}
