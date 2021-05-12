package com.course.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BasicAnnotation {

    @Test
    public void  testCase1(){
        System.out.println("这是测试用例1");
        }
    @BeforeMethod
    public void beforClass() {
        System.out.println("这是方法前运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("这是类前运行的");
        }
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("这是测试套件");
    }

}
