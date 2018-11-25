package com.ace.admin.report.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Created by Chris on 2018/9/3.
 */
@Component
public class ScheduleTest {

    private Logger logger = LoggerFactory.getLogger(ScheduleTest.class);

    @Scheduled(cron = "0 2/3 * * * *")
    public void scheduleTest() {
        logger.info("当前时间 ------->>>>" + LocalDateTime.now());
    }
}
