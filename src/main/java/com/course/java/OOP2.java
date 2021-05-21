package com.course.java;

/**
 * @author KyrianSun
 * @create 2021-05-20 23:05
 */
public class OOP2 extends ArrayTest{
    private int name =0;
    private int age = 0;

    @Override
    public String toString() {
        return "OOP2{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        OOP2 o2 = new OOP2();
        ArrayTest a2 = new ArrayTest();
        if (o2 instanceof ArrayTest){

        }
        System.out.println(o2.equals(a2));
        OOP2 aa = new OOP2();
    }
    public OOP2(){
        double a = 1.1d;
        int b = (int) a;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OOP2 oop2 = (OOP2) o;
        return name == oop2.name && age == oop2.age;
    }



    public OOP2(int name, int age){
        this();
        this.name = name;
        this.age = age;
    }




}
