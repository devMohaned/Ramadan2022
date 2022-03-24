package com.ramadan.series.utils;

import java.text.SimpleDateFormat;

public class AppUtils {

    public static String convertTime(String format24h)
    {
        int hourOfDay = Integer.valueOf(format24h.substring(0,2));
        int minute = Integer.valueOf(format24h.substring(3,5));
       return ((hourOfDay > 12) ? hourOfDay % 12 : hourOfDay) + ":" + (minute < 10 ? ("0" + minute) : minute) + " " + ((hourOfDay >= 12) ? "مساءا" : "صباحا");
      //  return format24h;
    }
}
