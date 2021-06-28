package com.course.testng.groups;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

/**
 * @author KyrianSun
 * @create 2021-06-27 22:11
 */
public class BaseDriver {
    WebDriver driver;
    public void BaseDriver(){

        System.setProperty("webdriver.chrome.driver","G:\\Java-Project\\java-service\\src\\main\\resources\\driver\\chromedriver.exe");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver=new ChromeDriver();
    }
    public WebElement findElement(By by){
        WebElement element = driver.findElement(by);
        return element;
    }
    public void takeScreenShot(){
        long date = System.currentTimeMillis();
        String path = String.valueOf(date);
        String curPath = System.getProperty("user.dir");
        path = path + ".png";
        String screenPath = curPath+"/"+path;
        File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screen,new File(screenPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
