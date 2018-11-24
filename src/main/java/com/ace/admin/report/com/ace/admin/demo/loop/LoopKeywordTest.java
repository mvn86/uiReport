package com.ace.admin.report.com.ace.admin.demo.loop;

/**
 * Created by Chris on 2018/8/30.
 */
public class LoopKeywordTest {

    public static void main(String[] args) {
        int[] array = new int[]{8, 9, 10, 11};

//        //找到数组内的值等于10，跳出此次循环
//        for (int val : array) {
//
//            if (val == 10) {
//
//                System.out.println("找到数组值等于10，跳出。");
//
//                break;
//            }
//
//            System.out.printf(val + "\t");
//        }


        // 找到数组值等于10，继续下一次循环
        for (int val : array) {

            if (val == 10) {

                System.out.println("找到数组值等于10，跳出。");

                continue;
            }

            System.out.printf(val + "\t");
        }

    }
}
