package com.example.org.unittestcasedemo;

import java.text.SimpleDateFormat;

/**
 * Used to convert time
 */

public class DateTimeConverter {

    public static String convertTime(long date) {
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        String formattedDate = df.format(date);
        return formattedDate;
    }
}
