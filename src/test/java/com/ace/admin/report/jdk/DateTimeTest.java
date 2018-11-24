package com.ace.admin.report.jdk;

import org.joda.time.DateTime;
import org.junit.Test;

/**
 * Created by yuchao on 2017/9/1.
 */
public class DateTimeTest {

    @Test
    public void duration() throws Exception {
        long du1 = 14999l;
        DateTime dateTime = new DateTime(du1);
        //System.out.println(dateTime.getHourOfDay());
        System.out.println(dateTime.getMinuteOfHour());
        System.out.println(dateTime.getSecondOfMinute());
        System.out.println(dateTime.getMillisOfSecond());
    }

    @Test
    public void estimatedDuration() throws Exception {
        long du1 = 14533l;
        DateTime dateTime = new DateTime(du1);
        //System.out.println(dateTime.getHourOfDay());
        System.out.println(dateTime.getMinuteOfHour());
        System.out.println(dateTime.getSecondOfMinute());
        System.out.println(dateTime.getMillisOfSecond());
    }

    @Test
    public void name() throws Exception {
        long mss = 14999l;//毫秒数

        long days = mss / (1000 * 60 * 60 * 24);
        long hours = (mss % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
        long minutes = (mss % (1000 * 60 * 60)) / (1000 * 60);
        long seconds = (mss % (1000 * 60)) / 1000;
        System.out.println(days + " days " + hours + " hours " + minutes + " minutes "
                + seconds + " seconds ");
    }

    @Test
    public void timeParseTest() {
        long duration = 14533l;
        String time = "";

        long minute = duration / 60000;
        long seconds = duration % 60000;

        long second = Math.round((float) seconds / 1000);

        if (minute < 10) {
            time += "0";
        }
        time += minute + ":";

        if (second < 10) {
            time += "0";
        }
        time += second;
        System.out.println(time);
    }
}
