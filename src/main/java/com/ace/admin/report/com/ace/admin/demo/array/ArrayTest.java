package com.ace.admin.report.com.ace.admin.demo.array;

/**
 * Created by yuchao on 2018/08/29.
 */
public class ArrayTest {

    public static void main(String[] args) {

        // 声明一个String 数组，并初始化长度为"0"
        String[] strArray = new String[3];

        strArray[0] = "a";
        strArray[1] = "b";
        strArray[2] = "c";

        // 声明一个double 类型数组
        double[] doubles;


        int[] array = new int[]{1, 2, 3, 5, 8, 9, 10, 11};

        System.out.println(array.length);

        // 取出数组内的值
        System.out.println(array[3]);

    }
}
