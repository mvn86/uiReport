package com.ace.admin.report;

import com.ace.admin.report.properties.StorageProperties;
import com.ace.admin.report.service.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
@EnableCaching
@EnableScheduling
public class UiReportApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// 指定spring 配置
		return builder.sources(UiReportApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(UiReportApplication.class, args);
	}

	/**
	 * 清空并初始化'upload-dir' 目录
	 * @param storageService
	 * @return
	 */
	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.deleteAll();
			storageService.init();
		};
	}

}
