package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HelloWorld {

    private int num;

    public static void main(String[] args) {
        //region Description
        getHello();
    }

    private static void getHello() {
        System.out.println("helloworld");
        //endregion
        ArrayList list =new ArrayList();
    }

    public void method(){
        num = 10;
        try {
            FileInputStream fis=new FileInputStream("fie.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
