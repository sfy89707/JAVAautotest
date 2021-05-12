package com.course.testng.suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public static void main(String[] args) {
        WebDriver driver;
//        System.setProperty("webdriver.firefox.marionette","G:\\JAVAautotest\\src\\main\\resources\\driver\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","G:\\JAVAautotest\\src\\main\\resources\\driver\\chromedriver.exe");
//        driver = new FirefoxDriver();
        driver = new ChromeDriver();
//        driver.get("http://www.baidu.com");
    }
}
