package com.courses.lesson14;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainLesson
{
    public static void main(String[] args)
    {
        Calendar calendar = new GregorianCalendar(2022, 4, 19);//только здесь месяцы с нуля)
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
