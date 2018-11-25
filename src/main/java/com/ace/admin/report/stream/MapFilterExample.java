package com.ace.admin.report.stream;

import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.joining;

/**
 * map stream 使用
 *
 * @author Chris
 */
public class MapFilterExample {

    public static void main(String[] args) {
        Map<Integer, String> HOSTING = new HashMap<>();
        HOSTING.put(1, "linode.com");
        HOSTING.put(2, "heroku.com");
        HOSTING.put(3, "digitalocean.com");
        HOSTING.put(4, "aws.amazon.com");

        // Before Java 8
        String result = "";
        for (Map.Entry<Integer, String> entry : HOSTING.entrySet()) {
            if ("aws.amazon.com".equals(entry.getValue())) {
                result = entry.getValue();
            }
        }
        System.out.println("Before Java 8 : " + result);

        //Map -> Stream -> Filter -> String
        result = HOSTING.entrySet().stream()
                .filter(map -> "aws.amazon.com".equals(map.getValue()))
                .map(map -> map.getValue())
                .collect(joining());

        System.out.println("With Java 8 : " + result);

        // filter more values
        result = HOSTING.entrySet().stream()
                .filter(x -> {
                    String mapValue = x.getValue();
                    if (!mapValue.contains("amazon") && !mapValue.contains("digital")) {
                        return true;
                    }
                    return false;
                })
                .map(map -> map.getValue())
                .collect(joining(","));

        System.out.println("With Java 8 : " + result);
    }
}
