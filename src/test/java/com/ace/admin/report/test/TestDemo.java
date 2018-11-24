package com.ace.admin.report.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestDemo {
    public static void main(String[] args) {
        String property = System.getProperty("user.home");
        System.out.println(property);
        Path path = Paths.get(property);
        Path xxPath = path.resolve("xxxx");
        try {
            Files.createDirectory(xxPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
