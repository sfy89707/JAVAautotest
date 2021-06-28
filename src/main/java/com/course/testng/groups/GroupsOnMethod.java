package com.course.testng.groups;

import org.openqa.selenium.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({TestNGListenerScreenShot.class})
public class GroupsOnMethod extends BaseDriver {
    @Test
    public void initDriverChrome(){
//        System.setProperty("webdriver.gecko.driver","G:\\Java-Project\\java-service\\src\\main\\resources\\driver\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","G:\\Java-Project\\java-service\\src\\main\\resources\\driver\\chromedriver.exe");
//        WebDriver driver = new FirefoxDriver();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("http://www.imooc.com");
        driver.manage().window().maximize();
        driver.quit();
    }


    public void loginScript(){
        driver.findElement(By.id("js-signin-btn")).click();
        WebElement user = driver.findElement(By.name("email"));
        user.isDisplayed();
        WebElement password = driver.findElement(By.name("password"));
        password.isDisplayed();
    }


    public void test4(){

    }


}
