package com.course.java;

import org.testng.annotations.Test;

import java.util.Scanner;

/**
 * @author IvanSun
 * @create 2021-04-2021/4/12 16:21
 */
public class HelloJava {
    /*
    单行注释
    多行注释
    注释的内容不参与编译。


     */

    /**
     * 文档注释
     *
     */
    public static void main(String[] args) {
//        变量的定义
        int myAge = 12;
        byte b1 = -128;
        byte b2 = (byte) 128;
        long l1 = 12412412l;
        //char 必须是单引号；
        char c1 = 'a';
        System.out.println(l1);

        double d1 = 12.3;
        int i1 = (int) d1;
        System.out.println(i1);
        String s1 = "a";
        int i2 = 10;
        System.out.println(s1+i2);
        System.out.println(7%5);
        int num1=12;
        int num2=5;
        double result1 = num1/num2;

        double s0 = 0.3;
        int s2 = (int)s0;
        System.out.println("s2: "+s2);

    }
    @Test
    public static void scaner(){
/*
通过输入年月日来判断是多少天。
 */
        boolean b = true;
        int a =1;
        Scanner scanner = new Scanner(System.in);
        String baba = "babababab";
        baba.charAt(2);
        int year = scanner.nextInt();
        System.out.println("年份");
        int month = scanner.nextInt();
        System.out.println("月份");
        int day = scanner.nextInt();
        System.out.println("日期");
        int sumDays = 0;
        switch (month){
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
//                sumDays += 28;
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                sumDays += 29;
                else
                sumDays += 28;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
        }
        System.out.println("年份"+year+"月份"+month+"日期"+"\n"+"总共第"+sumDays+"天");

    }
    public void seitch(){
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum=i;
        }
        System.out.println(sum);
        Scanner scan = new Scanner(System.in);
        int positiveNumber = 0;//记录正数的个数。
        int negativeNumber = 0;//记录负数的个数。
        while (true){
            int number = scan.nextInt();
            if (number>0){
                positiveNumber++;
            }else if(number<0){
                negativeNumber++;
            }else{
                break;
            }
        }

    }
    @Test
    public void nineNineTable(){
        for (int i = 1;i <= 9; i++){
            for (int j =1;j <= i;j++){
                System.out.print(i + " * " + j + " = " + (i * j) + " ");
            }
            System.out.println();
        }
    }
    @Test
    public void primeNumber(){
        long statTime = System.currentTimeMillis();
        boolean isFlag = true;
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if (isFlag){
                System.out.println(i);
            }
            isFlag = true;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-statTime);
    }

    @Test
    public void primeNumber2(){
        long statTime = System.currentTimeMillis();
        label:for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    continue label;
                }
            }
                System.out.println(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime-statTime);
    }

    public static char readNumbers(){
    char c = 0;
    String str = "abc";
        try {
            c = str.charAt(0);
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return c;
        }

    }
    public void yinZi(){


        //完数
        int factor = 0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                if (i%j==0){
                    factor += j;
                }
            }
            if (i == factor){
                System.out.println(i);
            }
            factor = 0;
        }

    }
    
}
