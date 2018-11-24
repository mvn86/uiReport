package com.ace.admin.report.com.ace.admin.demo.array;

/**
 * Created by yuchao on 2018/08/29.
 */
public class TwoDWithTest {

    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3, 5, 8, 9, 10, 11}, {6, 8, 9, 11, 22, 32}};

        System.out.println(array.length);

        for (int[] arrayVal : array) {
            System.out.println(arrayVal.toString());
            for (int val : arrayVal) {
                System.out.println(val);
            }

            System.out.println("=========================");
        }

    }
}
