package com.ace.admin.report.com.ace.admin.demo.set;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Chris on 2018/8/30.
 */
public class ListTest {


    /**
     * ArrayList 使用
     */
    private static void useList() {

        ArrayList<String> stringList = new ArrayList<>();

        // 添加元素
        stringList.add("abc");
        stringList.add("efg");
        stringList.add("hij");

        // 删除一个元素
        stringList.remove("abc");

        // 获取元素长度
        int size = stringList.size();
        System.out.println(size);

        //获取元素
        String str = stringList.get(1);
        System.out.println(str);

        // 集合中是否包含某个元素值
        boolean bool = stringList.contains("abc");
        System.out.println(bool);


        // ......

    }

    /**
     * linkList 的使用
     */
    private static void useLinkList() {

        LinkedList<String> stringLinkList = new LinkedList<>();

        stringLinkList.add("abc");
        stringLinkList.add("efg");
        stringLinkList.add("hij");

        // 固定位子写入数据
        stringLinkList.add(1, "123");


        //获取第一个值
        String firstStr = stringLinkList.getFirst();
        String lastStr = stringLinkList.getLast();

        // 项第一位增加数据
        stringLinkList.push("456");

        // 向首位添加数据
        stringLinkList.addFirst("789");
        // 向末尾添加数据
        stringLinkList.addLast("hbn");

        // 删除第一个位置的值
        stringLinkList.removeFirst();
        // 删除最有一个位置的值
        stringLinkList.removeLast();

        //........

    }


    public static void main(String[] args) {
        useLinkList();
//        useList();
    }

}
