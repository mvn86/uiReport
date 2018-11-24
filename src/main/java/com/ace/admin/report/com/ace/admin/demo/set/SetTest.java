package com.ace.admin.report.com.ace.admin.demo.set;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Chris on 2018/8/30.
 */
public class SetTest {

    public static void main(String[] args) {
        useTreeSetTest();
    }

    /**
     * hast set 使用
     */
    private static void useHashSetTest() {
        HashSet<String> hashSet = new HashSet<>();

        // 添加元素
        hashSet.add("abc");
        hashSet.add("abc");
        hashSet.add("bce");

        // 获取hashSet size
        int setSize = hashSet.size();
        System.out.println(setSize);
    }

    /**
     * hast set 使用
     */
    private static void useTreeSetTest() {

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("abc");
        treeSet.add("abc");
        treeSet.add("bce");


    }
}
