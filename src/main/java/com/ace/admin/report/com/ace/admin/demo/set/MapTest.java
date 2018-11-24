package com.ace.admin.report.com.ace.admin.demo.set;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Chris on 2018/8/30.
 */
public class MapTest {

    public static void main(String[] args) {
        hashMapTest();
    }


    private static void hashMapTest() {
        HashMap<String, String> map = new HashMap<>();

        // 存放map数据
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");

        // 通过key 来获取value值
        String value = map.get("a");
        System.out.println("get key-a value " + value);
        // map 大小
        int mapSize = map.size();
        System.out.println(mapSize);

        map.keySet();

        for (Map.Entry<String, String> entry : map.entrySet()) {

            String key = entry.getKey();
            String val = entry.getValue();
            System.out.println(key + "==" + val);

        }

    }
}
