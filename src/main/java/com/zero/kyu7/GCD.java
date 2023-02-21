package com.zero.kyu7;

public class GCD {
    public static int compute(int x, int y) {
        if(x % y == 0){
            return y;
        }
        if(y % x == 0){
            return x;
        }
        int min = Math.min(x, y);
        int great = 0;
        for(int i = 1; i <= min; i++){
            if(min % i == 0 && min != i){
                great = i;
            }
        }
        if(x % great == 0){
            return great;
        }

        System.out.println("great : " + great);
        return 0;
    }
}
