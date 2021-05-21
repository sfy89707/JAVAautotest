package com.course.java;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author KyrianSun
 * @create 2021-05-15 17:24
 */
public class ArrayTest {
    private int name;
    private int age;
    String a = "a";
    public ArrayTest(String v){


    }
    public ArrayTest(){

    }


    @Test
    public void hashdCode() {
        this.a = "aaa";
        /*
        1.一维数组的声明和初始化。
         */
            
        String[] strings = new String[8];
        strings[0] = "a";
        int[] ints = new int[]{1,2,3,4,5};
        List<String> list = new ArrayList();
        ints[0] = 9;
        int[] ints1[] = new int[7][];

        for (int i = 0; i < ints1.length; i++) {
            System.out.println(ints1[i]);
        }
        int arr[] = new int[10];
    for (int i = 0; i < arr.length; i++) {
        //求元素的最大值
        arr[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
    }
    int arrMax = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr[0] < arr[i]) {
            arrMax = arr[i];
        }

    }
    }
    @Test
    public void sortBB(){
       int[] arr = new int[]{8,7,6,5,4,3,2,1};
       for (int i = 0;i < arr.length;i++){
           for (int j = 0; j < arr.length-1; j++) {
               if(arr[j]>arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
               }
           }
           
       }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
    @Test
    public void objectNew(){
    int array1[]  = new int[]{1,2};
    int array2[];
        array2 =array1;
        System.out.println(array1);
        System.out.println(array2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayTest arrayTest = (ArrayTest) o;
        return name == arrayTest.name && age == arrayTest.age && Objects.equals(a, arrayTest.a);
    }

}
