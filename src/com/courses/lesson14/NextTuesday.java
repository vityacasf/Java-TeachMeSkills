package com.courses.lesson14;

import java.util.Calendar;

public class NextTuesday
{
    public static Calendar nextDayOfWeek(int dayOfWeek)
    {
        Calendar date = Calendar.getInstance();
        int diff = dayOfWeek - date.get(Calendar.DAY_OF_WEEK);
        if (diff <= 0)
        {
            diff += 7;
        }
        date.add(Calendar.DAY_OF_MONTH, diff);
        return date;
    }
    public static void main(String[] args)
    {
        System.out.printf(
                "%ta, %<tb %<te, %<tY",
                nextDayOfWeek(Calendar.TUESDAY)
        );
    }

}
