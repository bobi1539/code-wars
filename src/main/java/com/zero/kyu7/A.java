package com.zero.kyu7;

public class A {
    private static int number = 1;
    private static boolean isFirst = true;
    public static int getNumber() {
        if(isFirst){
            isFirst = false;
            return number;
        }
        return number *= 2;
    }
}
