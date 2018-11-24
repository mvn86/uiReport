package com.ace.admin.report.com.ace.admin.demo.condition;

/**
 * Created by yuchao on 2018/08/28.
 */
public class ConditionalStatements {

    public static void main(String[] args) {

//        if (1 > 0) {
//            System.out.println("1 大于 0 ");
//        } else if (1 == 0) {
//            System.out.println("=====");
//        } else {
//            System.out.println("122");
//        }


        int i = 0;
        switch (i) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            default:
                System.out.println("default");

        }
    }
}
