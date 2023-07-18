package com.zero.kyu7;

public class LeapYears {

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            isLeapYear = true;
        }
        if (year % 100 == 0) {
            isLeapYear = false;
        }
        if (year % 400 == 0) {
            isLeapYear = true;
        }
        return isLeapYear;
    }
}
