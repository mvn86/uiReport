package com.ace.admin.report.com.ace.admin.demo.array;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

/**
 * Created by Chris on 2018/8/30.
 */
public class ArrayUtilsTest {

    public static void main(String[] args) {

        int[] array = new int[4];


        // 数组赋值
        array[0] = 1;
        array[1] = 32;
        array[2] = 11;
        array[3] = 20;
        // array[4] = 33;

        // 数组取值
        int val = array[1];


        // jdk 自带
        Arrays.sort(array);

        System.out.println(array.length);


        // ArrayUtils -apache commons-lang3 工具包
        ArrayUtils.reverse(array);

        System.out.println(array.length);
    }
}
