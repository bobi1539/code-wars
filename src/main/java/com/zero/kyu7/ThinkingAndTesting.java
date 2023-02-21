package com.zero.kyu7;

public class ThinkingAndTesting {
    public static int testAB(int a, int b) {
        if(a == b){
            return a;
        }
        if(a != b){
            if(a == 0){
                return b;
            }
            if(b % 3 == 0){
                return b;
            }
            if(b % 2 == 0){
                return a + b;
            } else {
                return a * b;
            }
        }
        return 0;
    }
}
