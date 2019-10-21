package com.javarush.task.task08.task0827;

import sun.util.calendar.Gregorian;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        String trueDate = date.trim().replaceAll("\\s+", " ");
        String[] parts = trueDate.split(" ");

        int month;
        if (parts[0].equals("JANUARY"))
            month = 0;
        else if (parts[0].equals("FEBRUARY"))
            month = 1;
        else if (parts[0].equals("MARCH"))
            month = 2;
        else if (parts[0].equals("APRIL"))
            month = 3;
        else if (parts[0].equals("MAY"))
            month = 4;
        else if (parts[0].equals("JUNE"))
            month = 5;
        else if (parts[0].equals("JULY"))
            month = 6;
        else if (parts[0].equals("AUGUST"))
            month = 7;
        else if (parts[0].equals("SEPTEMBER"))
            month = 8;
        else if (parts[0].equals("OCTOBER"))
            month = 9;
        else if (parts[0].equals("NOVEMBER"))
            month = 10;
        else
            month = 11;

        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(parts[1]));
        calendar.set(Calendar.YEAR, Integer.parseInt(parts[2]));

        return calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0;
    }
}
