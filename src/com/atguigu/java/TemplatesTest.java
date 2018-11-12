package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

public class TemplatesTest {


    //prsf:可生成 private static final
    private static final Customer CUST = new Customer();

    //psf:可生成 public static final
    public static final int NUM =1;

    public static void main(String[] args) {
        //sout:可生成System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num1 = 10;
        System.out.println("num1 = " + num1);
        String[] arr = new String[]{"Tom", "Jerry", "HanMeimei"};
        //fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);//s.sout
        }
        //list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        for (Object o : list) {
            System.out.println(o);
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }

    public void method() {
        //new ArrayList() 按ctrl+enter 变成 ArrayList list = new ArrayList();
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(677);
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }

    }
}
