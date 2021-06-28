package com.course.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author KyrianSun
 * @create 2021-06-06 23:33
 */
public class PropertiesTest {
    public static void main(String[] args) {
        Properties pros = new Properties();
        FileInputStream fis = null;

        {
            try {
                fis = new FileInputStream("src/main/java/jdbc.properties");
                pros.load(fis);
                String name = pros.getProperty("name");
                System.out.println(name);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
