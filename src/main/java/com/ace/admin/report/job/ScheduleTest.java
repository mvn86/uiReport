package com.ace.admin.report.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Created by Chris on 2018/9/3.
 */
@Component
public class ScheduleTest {


    @Scheduled(cron = "0 2/3 * * * *")
    public void scheduleTest() {
        System.out.println("当前时间 ------->>>>" + LocalDateTime.now());
    }
}
