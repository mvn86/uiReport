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
        Map<Integer, String> hosting = new HashMap<>(16);
        hosting.put(1, "linode.com");
        hosting.put(2, "heroku.com");
        hosting.put(3, "digitalocean.com");
        hosting.put(4, "aws.amazon.com");

        // Before Java 8
        String result = "";
        for (Map.Entry<Integer, String> entry : hosting.entrySet()) {
            if ("aws.amazon.com".equals(entry.getValue())) {
                result = entry.getValue();
            }
        }
        System.out.println("Before Java 8 : " + result);

        //Map -> Stream -> Filter -> String
        result = hosting.entrySet().stream()
                .filter(map -> "aws.amazon.com".equals(map.getValue()))
                .map(map -> map.getValue())
                .collect(joining());

        System.out.println("With Java 8 : " + result);

        // filter more values
        result = hosting.entrySet().stream()
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
