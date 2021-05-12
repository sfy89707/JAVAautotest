package com.course.testng.groups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    public static void main(String[] args) {
        WebDriver driver;
//        System.setProperty("webdriver.firefox.marionette","G:\\JAVAautotest\\src\\main\\resources\\driver\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","G:\\JAVAautotest\\src\\main\\resources\\driver\\chromedriver.exe");
//        driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.get("http://www.baidu.com");

    }

    @Test
    public void test1(){

        System.setProperty("webdriver.gecko.driver","G:\\JAVAautotest\\src\\main\\resources\\driver\\geckodriver.exe");
//        System.setProperty("webdriver.chrome.driver","G:\\JAVAautotest\\src\\main\\resources\\driver\\chromedriver.exe");
        WebDriver driver = new FirefoxDriver();
//       WebDriver driver = new ChromeDriver();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("http://www.baidu.com");
    }


    public void test2(){

    }

    public void test3(){

    }

    public void test4(){

    }


}
