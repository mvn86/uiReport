package com.ace.admin.report.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * 文件存储service
 * @author Chris
 */
public interface StorageService {

    /**
     * 初始化跟目录
     */
    void init();

    /**
     * 存储文件
     *
     * @param file
     */
    void store(MultipartFile file);

    /**
     * 加载根目录下的所有文件
     *
     * @return
     */
    Stream<Path> loadAll();

    /**
     * 加载指定文件
     *
     * @param filename
     * @return
     */
    Path load(String filename);

    /**
     * 加载指定文件资源
     *
     * @param filename
     * @return
     */
    Resource loadAsResource(String filename);

    /**
     * 删除所有文件
     */
    void deleteAll();

}
