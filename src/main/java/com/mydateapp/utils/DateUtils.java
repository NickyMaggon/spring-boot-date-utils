package com.mydateapp.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class DateUtils {

    public static String getKafkaFormattedTime(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        return formatter.format(date);
    }

    public static Date minusMinutesInDate(Integer minutes){

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE,-minutes);

        return calendar.getTime();
    }


    private static final ZoneId zoneId = ZoneId.of( "UTC" );


    public static Date addMinutesToADate(Date date, int minutes){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, minutes);
        return calendar.getTime();
    }

    public static Date addHours(Date date, int hours){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, hours);
        return calendar.getTime();
    }

    public static String getCurrentDateWithZone() {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        return df.format(date);
    }

    public static String getCurrentDate() {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyyMMdd_HHmmss");
        return df.format(date);
    }


    public static String dateWithLastHour() {
        Calendar calendar = Calendar.getInstance();
        calendar.clear(Calendar.MINUTE);
        calendar.clear(Calendar.SECOND);
        calendar.clear(Calendar.MILLISECOND);
        calendar.add(Calendar.HOUR_OF_DAY, -1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        return sdf.format(calendar.getTime());
    }


    public static String currentDateHour() {
        Calendar calendar = Calendar.getInstance();
        calendar.clear(Calendar.MINUTE);
        calendar.clear(Calendar.SECOND);
        calendar.clear(Calendar.MILLISECOND);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        return sdf.format(calendar.getTime());
    }

    public static String getDateMinusDays(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.clear(Calendar.MINUTE);
        calendar.clear(Calendar.SECOND);
        calendar.clear(Calendar.MILLISECOND);
        calendar.add(Calendar.DAY_OF_MONTH, -days);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        return sdf.format(calendar.getTime());
    }

    public static long timeDifferenceFromCurrentTimeInMinutes(Date date){
        return TimeUnit.MINUTES.convert(new Date().getTime() - date.getTime(),TimeUnit.MILLISECONDS);
    }



}
