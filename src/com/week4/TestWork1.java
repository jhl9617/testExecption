package com.week4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestWork1 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.get(Calendar.YEAR) + "년 " +
                calendar.get(Calendar.MONTH) + "월 " +
                calendar.get(Calendar.DATE) + "일 " +
                calendar.get(Calendar.HOUR) + "시 " +
                calendar.get(Calendar.MINUTE) + "분 " +
                calendar.get(Calendar.SECOND) + "초 "
                );
    }
}
