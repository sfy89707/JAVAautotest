package com.course.java;

/**
 * @author KyrianSun
 * @create 2021-05-21 18:39
 */
public class Newly {



    public static void main(String[] args) {

        Chinese c1 = new Chinese();
        c1.age = 10;
        c1.name = "sun";

        Chinese c2 = new Chinese();
//        c2.age = 30;
//        c2.name = "feng";

        System.out.println(c2.age);
    }

}

class Chinese {
    int age;
    String name;
    static String nation;
}